package section13.user;

import section13.book.Book;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private final String id;

  private final String name;

  private String password;

  private List<Book> borrowedBooks;

  private boolean isAdmin;

  public User(String id, String name, String password, boolean isAdmin) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.isAdmin = isAdmin;
    this.borrowedBooks = new ArrayList<>();
  }

  public String getId() {
    return id;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public String getName() {
    return name;
  }

  public void changeAdmin(boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public boolean checkPassword(String password) {
    return this.password.equals(password);
  }

  public List<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void setBorrowedBooks(List<Book> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  public void borrowBook(Book book) {
    borrowedBooks.add(book);
    book.checkout(getId());
  }

  public void returnBook(Book book) {
    borrowedBooks.remove(book);
    book.returnBook();
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", borrowedBooks=" + borrowedBooks +
        ", isAdmin=" + isAdmin +
        '}';
  }
}
