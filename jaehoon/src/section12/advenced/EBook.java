package section12.advenced;

public class EBook extends AbstractBook {

  private final String format;

  public EBook(String title, String author, String format) {
    super(title, author);
    this.format = format;
  }

  @Override
  public String toString() {
    return "EBook{" +
        "제목='" + super.getTitle() + '\'' +
        ", 저자='" + super.getAuthor() + '\'' +
        ", 포맷='" + format + '\'' +
        '}';
  }
}
