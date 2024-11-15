package section04;

import java.util.ArrayList;
import java.util.Iterator;
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
    return this.books.add(newBook);
  }

  // 모든 도서 조회
  void printAllBooks() {
    System.out.println("### 모든 도서 출력 ###");
    for (Book book : this.books) {
      System.out.println(book);
    }
  }

  // 제목으로 도서 검색
  Optional<Book> searchByTitle(String title) {
    for (Book book : this.books) {
      if (book.matchesTitle(title)) {
        return Optional.of(book);
      }
    }
    return Optional.empty();
  }

  // 도서번호로 도서 검색
  Optional<Book> searchByIsBn(String isBn) {
    for (Book book : this.books) {
      if (book.matchesIsBn(isBn)) {
        return Optional.of(book);
      }
    }
    return Optional.empty();
  }

  // 도서 삭제 (removeIf를 사용)
  void deleteByIsBn(String isBn) {
    Iterator<Book> iterator = books.iterator();
    while (iterator.hasNext()) {
      Book book = iterator.next();

      if (book.matchesIsBn(isBn)) {
        if (book.isCheckedOut()) {
          System.out.println("대출 중인 도서는 삭제할 수 없습니다.");
          return;
        }

        iterator.remove();
        System.out.println("도서(" + book.getTitle() + ")가 삭제되었습니다.");
        return;
      }
    }

    System.out.println("도서를 찾을 수 없습니다.");
  }

  // 도서 대출
  void checkOutBook(String isBn) {
    try {
      Book book = searchByIsBn(isBn).orElseThrow(() -> new IllegalStateException("검색한 도서가 존재하지 않습니다."));
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
