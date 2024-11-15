package section04;

import java.util.Objects;

public class Book {

  private String title;

  private String author;

  private String isBn;

  private boolean isCheckedOut;

  public Book(String title, String author, String isBn) {
    this.title = title;
    this.author = author;
    this.isBn = isBn;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getIsBn() {
    return this.isBn;
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }

  // 도서명 확인 메서드
  public boolean matchesTitle(String title) {
    return this.title.equalsIgnoreCase(title);
  }

  // 도서번호 확인 메서드
  public boolean matchesIsBn(String isBn) {
    return this.isBn.equalsIgnoreCase(isBn);
  }

  // 도서 대출 상태로 설정하는 메서드
  public void checkout() throws IllegalStateException {
    if (isCheckedOut) {
      throw new IllegalStateException("이미 대출된 도서입니다.");
    }
    isCheckedOut = true;
  }

  // 도서 반납 상태로 설정하는 메서드
  public void returnBook() throws IllegalStateException {
    if (!isCheckedOut) {
      throw new IllegalStateException("이 도서는 대출 상태가 아닙니다.");
    }
    isCheckedOut = false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(title, book.title)
        && Objects.equals(author, book.author)
        && Objects.equals(isBn, book.isBn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author, isBn);
  }

  @Override
  public String toString() {
    return "도서{" +
        "제목='" + title + '\'' +
        ", 저자='" + author + '\'' +
        ", 도서번호='" + isBn + '\'' +
        ", 대출 유무='" + isCheckedOut + '\'' +
        '}';
  }
}
