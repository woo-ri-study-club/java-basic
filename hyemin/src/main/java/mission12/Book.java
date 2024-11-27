package mission12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isAvailable = true;
    }

    public void markAsUnavailable() {
        isAvailable = false;
    }

    public void markAsAvailable() {
        isAvailable = true;
    }

    public boolean isNotAvailable() {
        return !isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", ISBN: " + isbn + ", 대출 가능: " + (isAvailable ? "예" : "아니오");
    }
}
