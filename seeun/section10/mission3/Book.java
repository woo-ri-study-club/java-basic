package section10.mission3;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.print("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
