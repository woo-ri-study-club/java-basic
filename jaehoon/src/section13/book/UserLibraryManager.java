package section13.book;

import section13.user.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class UserLibraryManager implements LibraryManager {

  private final Library library;

  private Map<String, Book> books;


  public UserLibraryManager(Library library) {
    this.library = library;
    books = library.getAllBooks();
  }

  @Override
  public void checkedOutBook(User user, String isbn) {
    Book book = books.get(isbn);
    if (isNull(book)) {
      throw new IllegalArgumentException("해당 ISBN의 책을 찾을 수 없습니다.");
    }
    if (book.isCheckedOut()) {
      throw new IllegalStateException("이미 대출된 책입니다.");
    }

    // 유저에 빌린 도서 추가
    user.borrowBook(book);

    // 대출상태로 변경된 book 업데이트
    library.saveBook(books);
    System.out.println("대출을 완료합니다: " + book);
  }

  @Override
  public void returnBook(User user, String isbn) {
    List<Book> borrowedBooks = user.getBorrowedBooks();
    if (borrowedBooks == null || borrowedBooks.isEmpty()) {
      throw new IllegalStateException("대출한 책이 없습니다.");
    }

    Book bookToReturn = borrowedBooks.stream()
                                     .filter(book -> book.getIsbn().equals(isbn))
                                     .findFirst()
                                     .orElseThrow(() -> new IllegalArgumentException("해당 ISBN의 대출 기록이 없습니다."));

    // 유저에서 빌린 도서 제거
    user.returnBook(bookToReturn);

    // 반납상태로 변경된 book 업데이트
    library.saveBook(books);
  }

  @Override
  public void viewBorrowedBooks(User user) {
    List<Book> borrowedBooks = user.getBorrowedBooks();
    if (borrowedBooks.isEmpty()) {
      System.out.println("####  대출중인 도서가 없습니다. #### ");
      return;
    }
    System.out.println("#### " + user.getName() + " 님의 대출 도서 목록 ####");
    for (Book borrowedBook : borrowedBooks) {
      System.out.println(borrowedBook);
    }
  }

  @Override
  public Book searchByIsbn(String isbn) {
    if (!books.containsKey(isbn)) {
      throw new IllegalArgumentException("존재하지 않는 책입니다. isbn: " + isbn);
    }
    return books.get(isbn);
  }

  @Override
  public void viewAllBooks() {
    if (books.isEmpty()) {
      System.out.println("등록된 책이 없습니다.");
    } else {
      books.forEach((s, book) -> {
        System.out.println(book);
      });
    }
  }

  @Override
  public List<Book> getBorrowedBooksByUserId(String userId) {
    return books.values()
                .stream()
                .filter(book -> book.isCheckedOut() && book.getCheckedOutByUserId().equals(userId))
                .collect(Collectors.toList());
  }

  @Override
  public void addBook(String isbn, String title, String author) {
    throw new IllegalArgumentException("유저는 도서를 추가할 수 없습니다.");
  }

  @Override
  public void deleteBook(Book book) {
    throw new IllegalArgumentException("유저는 도서를 제거할 수 없습니다.");
  }

  @Override
  public void viewBorrowedUserIds() {
    throw new IllegalArgumentException("유저는 대출한 회원을 조회할 수 없습니다.");
  }

}
