package mission4.advanced;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private Year publisherDate;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        publisherDate = Year.now();
    }

    public Book(String title, String author, int publisherDate) {
        this.title = title;
        this.author = author;
        this.publisherDate = Year.of(publisherDate);
    }

    public boolean isSameTitle(String title) {
        return title.equalsIgnoreCase(this.title);
    }

    @Override
    public String toString() {
        return "도서명: '" + title + '\'' +
                ", 작가: '" + author + '\'' +
                ", 출판 연도: " + publisherDate;
    }
}
