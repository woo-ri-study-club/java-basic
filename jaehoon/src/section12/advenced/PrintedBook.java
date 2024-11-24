package section12.advenced;

public class PrintedBook extends AbstractBook {

  private final String publisher;

  public PrintedBook(String title, String author, String publisher) {
    super(title, author);
    this.publisher = publisher;
  }

  public String getPublisher() {
    return publisher;
  }

  @Override
  public String toString() {
    return "PrintBook{" +
        "제목='" + super.getTitle() + '\'' +
        ", 저자='" + super.getAuthor() + '\'' +
        ", 출판사='" + publisher + '\'' +
        '}';
  }
}
