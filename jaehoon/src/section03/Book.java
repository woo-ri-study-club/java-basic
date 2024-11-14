package section03;

public class Book {

  private String title;

  private int price;

  public Book(String title, int price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public int getPrice() {
    return price;
  }

  public boolean isTitle(String title) {
    return this.title.equalsIgnoreCase(title);
  }

  @Override
  public String toString() {
    return "Book{" +
        "제목='" + title + '\'' +
        ", 가격=" + price +
        '}';
  }
}
