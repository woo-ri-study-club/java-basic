package section05;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class Library {

  final int DEFAULT_CAPACITY = 10;

  private final Book[] books;

  private int bookCount;

  public Library() {
    books = new Book[DEFAULT_CAPACITY];
  }

  public Library(int booksCapacity) {
    books = new Book[booksCapacity];
  }

  public boolean addBook(String title, String author, int publicationYear) throws IllegalStateException {
    if (books.length > bookCount) {
      Book newBook = new Book(title, author, publicationYear);
      books[bookCount] = newBook;
      bookCount++;
      return true;
    }
    throw new IllegalStateException("라이브러리에 도서를 추가할 공간이 부족합니다.");
  }

  public Optional<Book> searchByTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return Optional.of(book);
      }
    }
    return Optional.empty();
  }

  public void printAllBook() {
    for (Book book : books) {
      if (nonNull(book)) {
        System.out.println(book);
      }
    }
  }
}
