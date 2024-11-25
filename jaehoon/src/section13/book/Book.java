package section13.book;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private final String isbn;

  private final String title;

  private final String author;

  private String checkedOutByUserId;

  private boolean isCheckedOut;

  public Book(String isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    checkedOutByUserId = null;
    isCheckedOut = false;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getCheckedOutByUserId() {
    return checkedOutByUserId;
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }

  public void checkout(String checkedOutById) {
    isCheckedOut = true;
    this.checkedOutByUserId = checkedOutById;
  }

  public void returnBook() {
    checkedOutByUserId = null;
    isCheckedOut = false;
  }

  @Override
  public String toString() {
    return "도서{" +
        "도서번호='" + isbn + '\'' +
        ", 제목='" + title + '\'' +
        ", 저자='" + author + '\'' +
        ", 대출여부=" + (isCheckedOut ? "대출중" : "대출가능") +
        '}';
  }
}
