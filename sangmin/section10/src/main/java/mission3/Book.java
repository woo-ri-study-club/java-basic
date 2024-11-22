package mission3;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(final String title, final String author, final int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    protected String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    protected int getPrice() {
        return price;
    }
}
