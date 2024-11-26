package section13.book;

import section13.user.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class AdminLibraryManager implements LibraryManager {

  private final Library library;

  private Map<String, Book> books;

  public AdminLibraryManager(Library library) {
    this.library = library;
    books = library.getAllBooks();
  }

  @Override
  public void addBook(String isbn, String title, String author) {
    if (books.containsKey(isbn)) {
      throw new IllegalArgumentException("이미 존재하는 ISBN입니다.");
    }
    Book newBook = new Book(isbn, title, author);
    books.put(newBook.getIsbn(), newBook);
    library.saveBook(books);
    System.out.println("등록이 완료되었습니다: " + newBook);
  }

  @Override
  public void deleteBook(Book book) {
    if (isNull(books.remove(book.getIsbn()))) {
      throw new IllegalArgumentException("해당 책을 찾을 수 없습니다.");
    }
    library.saveBook(books);
  }

  @Override
  public void viewBorrowedUserIds() {
    Set<String> borrowedUserIds = library.getAllBooks().values()
                                         .stream()
                                         .filter(Book::isCheckedOut)
                                         .map(Book::getCheckedOutByUserId)
                                         .filter(Objects::nonNull)
                                         .collect(Collectors.toSet());
    if (borrowedUserIds.isEmpty()) {
      System.out.println("#### 대출한 회원이 없습니다. ####");
      return;
    }

    System.out.println("#### 대출한 회원 목록 ####");
    borrowedUserIds.forEach(System.out::println);
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
  public void checkedOutBook(User user, String isbn) {
    throw new IllegalArgumentException("관리자는 대출을 실행할 수 없습니다.");
  }

  @Override
  public void returnBook(User user, String isbn) {
    throw new IllegalArgumentException("관리자는 반납을 실행할 수 없습니다.");
  }

  @Override
  public List<Book> getBorrowedBooksByUserId(String userId) {
    throw new IllegalArgumentException("관리자는 대출한 책이 없습니다.");
  }

  @Override
  public void viewBorrowedBooks(User user) {
    throw new IllegalArgumentException("관리자는 빌린 책이 존재하지 않습니다.");
  }

}
