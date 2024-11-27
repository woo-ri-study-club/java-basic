package mission12.domain;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean canBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.canBorrowed = true;

        validateBook(title, author, isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "제목: " + title
                + ", 작가: " + author
                + ", ISBN: " + isbn;
    }

    public boolean isIsbnSame(String isbn){
        return this.isbn.equals(isbn);
    }

    private static void validateBook(String title, String author, String isbn) {
        validateField(title, "도서 제목은 null이거나 공백일 수 없습니다.");
        validateField(author, "도서 작가명은 null이거나 공백일 수 없습니다.");
        validateField(isbn, "도서 ISBN은 null이거나 공백일 수 없습니다.");
    }

    private static void validateField(String field, String errorMessage) {
        if (field == null || field.isBlank()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public boolean canBorrowed() {
        return canBorrowed;
    }

    public boolean cannotBorrowed(){
        return !canBorrowed();
    }

    public void borrowedBook(){
        canBorrowed = false;
    }

    public void returnBook(){
        canBorrowed = true;
    }
}
