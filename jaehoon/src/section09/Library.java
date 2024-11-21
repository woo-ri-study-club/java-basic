package section09;

import java.util.ArrayList;
import java.util.List;

public class Library {

  public static final int MAX_BOOKS = 100;

  private final List<Book> books;

  public Library() {
    this.books = new ArrayList<>(MAX_BOOKS);
  }

  public boolean addBook(Book newBook) {
    if (books.size() >= MAX_BOOKS) {
      System.out.println("라이브러리에 도서를 추가할 공간이 부족합니다.");
      return false;
    }
    books.add(newBook);
    System.out.println("도서가 등록되었습니다: " + newBook);
    return true;
  }

  public void showBooks() {
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
