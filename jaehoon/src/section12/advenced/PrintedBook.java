package section12.advenced;

public class PrintedBook implements Book {

  private final String title;

  private final String author;

  private final String publisher;

  public PrintedBook(String title, String author, String publisher) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  @Override
  public String toString() {
    return "PrintBook{" +
        "제목='" + title + '\'' +
        ", 저자='" + author + '\'' +
        ", 출판사='" + publisher + '\'' +
        '}';
  }
}
