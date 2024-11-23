package section12.advenced;

public abstract class AbstractBook implements Book {

  private final String title;

  private final String author;

  public AbstractBook(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getAuthor() {
    return author;
  }
}
