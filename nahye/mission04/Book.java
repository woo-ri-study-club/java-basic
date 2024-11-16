package mission04;

public class Book {

    private String title;
    private String author;
    private int publishedYear;

    public Book(String title, String author) {
        this(title, author, 2024);
    }

    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public boolean hasSameTitle(String title) {
        return this.title.equals(title);
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 출판연도:" + publishedYear;
    }
}
