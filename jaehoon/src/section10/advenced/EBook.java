package section10.advenced;

public class EBook extends Book {

  private String fileSize;

  private String format;

  public EBook(String title, String author, int price, String fileSize, String format) {
    super(title, author, price);
    this.fileSize = fileSize;
    this.format = format;
  }

  @Override
  public void displayDetails() {
    // super.displayDetails();
    // NOTE: 줄바꿈을 위해 super.getter로 접근
    System.out.println("Title: " + super.getTitle()
                         + ", Author: " + super.getAuthor()
                         + ", Price: " + super.getPrice()
                         + ", File Size: " + fileSize
                         + ", Format: " + format);
  }
}
