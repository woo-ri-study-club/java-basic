package mission4.middle;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private Year publisherDate;

    public Book(String title, String author) {
        this(title, author, 2024);
    }

    public Book(String title, String author, int publisherDate) {
        this.title = title;
        this.author = author;
        this.publisherDate = Year.of(publisherDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisherDate=" + publisherDate +
                '}';
    }
}
