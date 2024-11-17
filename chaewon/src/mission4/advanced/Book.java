package mission4.advanced;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private Year publisherDate;

    public Book(String title, String author) {
        this(title, author, 2024);
    }

    public Book(String title, String author, int publisherDate) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("제목을 입력해야 합니다.");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("작가명을 입력해야 합니다.");
        }

        if (publisherDate < 0) {
            throw new IllegalArgumentException("올바른 출판연도를 입력해야 합니다.");
        }

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
