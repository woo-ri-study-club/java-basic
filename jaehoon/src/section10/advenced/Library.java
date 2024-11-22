package section10.advenced;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private int maximumCapacity;

  private final List<Book> books;

  public Library(int maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    this.books = new ArrayList<>(maximumCapacity);
  }

  public boolean addBook(Book newBook) {
    if (books.size() >= maximumCapacity) {
      System.out.println("라이브러리에 도서를 추가할 공간이 부족합니다.");
      return false;
    }
    books.add(newBook);
    return true;
  }

  public void showAllBooks() {
    for (Book book : books) {
      book.displayDetails();
    }
  }

}
