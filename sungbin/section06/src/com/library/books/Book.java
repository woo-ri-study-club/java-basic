package com.library.books;

public class Book {

    private String title;

    private String author;

    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 작가: " + author + ", 일련번호: " + isbn;
    }
}
