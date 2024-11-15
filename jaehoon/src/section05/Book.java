package section05;

public class Book {

  private String title;

  private String author;

  private int publicationYear;

  public Book(String title, String author) {
    this(title, author, 2024);
  }

  public Book(String title, String author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  @Override
  public String toString() {
    return "도서{" +
        "제목='" + title + '\'' +
        ", 저자='" + author + '\'' +
        ", 출판연도=" + publicationYear +
        '}';
  }
}
