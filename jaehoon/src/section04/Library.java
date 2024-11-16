package section04;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

  private final List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  // 도서 추가
  boolean addBook(String title, String author, String isBn) {
    Book newBook = new Book(title, author, isBn);
    if (this.books.contains(newBook)) {
      System.out.println("이미 등록된 도서입니다.");
      return false;
    }
    books.add(newBook);
    System.out.println("도서가 등록되었습니다: " + newBook);
    return true;
  }

  // 모든 도서 조회
  void printAllBooks() {
    System.out.println("### 모든 도서 출력 ###");
    for (Book book : this.books) {
      System.out.println(book);
    }
  }

  // 제목으로 도서 검색
  public Optional<Book> searchByTitle(String title) {
    return books.stream()
                .filter(book -> book.matchesTitle(title))
                .findFirst();
  }

  // 고유번호로 도서 검색
  public Optional<Book> searchByIsBn(String isBn) {
    return books.stream()
                .filter(book -> book.matchesIsBn(isBn))
                .findFirst();
  }

  // 도서 삭제 (removeIf를 사용)
  void deleteByIsBn(String isBn) {
    this.searchByIsBn(isBn).ifPresentOrElse(
        book -> {
          if (book.isCheckedOut()) {
            System.out.println("대출 중인 도서는 삭제할 수 없습니다.");
            return;
          }
          books.remove(book);
          System.out.println("도서가 삭제되었습니다: " + book);
        },
        () -> System.out.println("도서를 찾을 수 없습니다.")
    );
  }

  // 도서 대출
  void checkOutBook(String isBn) {
    try {
      Book book = searchByIsBn(isBn).orElseThrow(() -> new IllegalStateException("검색한 도서가 존재하지 않습니다."));
      if (book.isCheckedOut()) {
        throw new IllegalStateException("이미 대출된 도서입니다.");
      }
      book.checkout();
      System.out.println("도서가 대출되었습니다: " + book);
    } catch (IllegalStateException illegalStateException) {
      System.out.println(illegalStateException.getMessage() + " 대출을 실행할 수 없습니다.");
    }
  }

  // 도서 반납
  void returnBook(String isBn) {
    try {
      Book book = searchByIsBn(isBn).orElseThrow(() -> new IllegalStateException("검색한 도서가 존재하지 않습니다."));
      if (!book.isCheckedOut()) {
        throw new IllegalStateException("이 도서는 대출 상태가 아닙니다.");
      }
      book.returnBook();
      System.out.println("도서가 반납되었습니다: " + book);
    } catch (IllegalStateException illegalStateException) {
      System.out.println(illegalStateException.getMessage() + " 반납을 실행할 수 없습니다.");
    }
  }

  // 대출 가능한 도서만 조회
  void printAvailableBooks() {
    System.out.println("### 대출 가능한 도서 목록 ###");
    for (Book book : this.books) {
      if (!book.isCheckedOut()) {
        System.out.println(book);
      }
    }
  }

}
