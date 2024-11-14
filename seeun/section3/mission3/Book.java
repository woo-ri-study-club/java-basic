package section3.mission3;

public class Book {

    private String title;
    private String author;
    private int price;

    private Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static Book of(String title, String author, int price) {
        return new Book(title, author, price);
    }

    public boolean isTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return  "title: " + title + ", author: " + author + ", price: " + price;
    }
}
