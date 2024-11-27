package me.sungbin.book;

import java.io.Serializable;

public class Book implements Serializable {

    private final String title;

    private final String author;

    private final String isbn;

    private boolean isLoaned;

    private static final long serialVersionUID = 1L;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isLoaned = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public boolean isNotLoaned() {
        return !isLoaned;
    }

    public void updateLoanStatusIs(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    @Override
    public String toString() {
        return String.format("제목: %s, 저자: %s, isbn: %s, 대출 상태: %s", title, author, isbn, isLoaned ? "대출 중" : "대출 가능");
    }
}
