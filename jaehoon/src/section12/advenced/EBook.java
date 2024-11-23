package section12.advenced;

public class EBook implements Book {

  private final String title;

  private final String author;

  private final String format;

  public EBook(String title, String author, String format) {
    this.title = title;
    this.author = author;
    this.format = format;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getAuthor() {
    return author;
  }

  public String getFormat() {
    return format;
  }

  @Override
  public String toString() {
    return "EBook{" +
        "제목='" + title + '\'' +
        ", 저자='" + author + '\'' +
        ", 포맷='" + format + '\'' +
        '}';
  }
}
