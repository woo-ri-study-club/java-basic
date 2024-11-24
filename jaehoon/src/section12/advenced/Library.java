package section12.advenced;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private final List<Book> books = new ArrayList<>();

  void addBook(Book book) {
    books.add(book);
  }

  void viewAllBooks() {
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
