package mission04;

import java.util.Objects;

public class Book {

    private static final int DEFAULT_YEAR = 2024;
    private String title;
    private String author;
    private int publishedYear;


    public Book(String title, String author) {
        this(title, author, DEFAULT_YEAR);
    }

    public Book(String title, String author, int publishedYear) {

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("제목은 필수 입력값입니다.");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("저자는 필수 입력값입니다.");
        }
        if (publishedYear < 0) {
            throw new IllegalArgumentException("출판연도는 0보다 작을 수 없습니다.");
        }

        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public boolean hasSameTitle(String title) {
        return Objects.equals(this.title, title);
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 출판연도:" + publishedYear;
    }
}
