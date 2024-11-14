package section03;

import java.util.Arrays;

public class Library {

  private static final int DEFAULT_CAPACITY = 10;

  private Book[] books;

  private int bookCount;

  public Library() {
    this.books = new Book[DEFAULT_CAPACITY];
    this.bookCount = 0;
  }

  private void expandArray() {
    this.books = Arrays.copyOf(books, books.length * 2);
  }

  public void addBook(Book newBook) {
    if (bookCount == books.length) {
      expandArray();
    }
    books[bookCount] = newBook;
    bookCount++;
  }

  public Book searchByTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return book;
      }
    }
    return null;
  }

  public void printBooks() {
    for (int i = 0; i < bookCount; i++) {
      System.out.println(String.format("제목 = %s, 가격 = %d",
                                       books[i].getTitle(),
                                       books[i].getPrice()));
    }
  }
}
