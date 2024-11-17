package section5.mission2;

public class Book {
    private String title;
    private String author;
    private int publishYear;
    private static final int DEFAULT_YEAR = 2024;

    public Book(String title, String author) {
        this(title, author, DEFAULT_YEAR);
    }

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", publishYear: " + publishYear;
    }
}
