package com.library.users;

import com.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        System.out.println(book.getTitle() + " 책을 빌립니다.");
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        if (!borrowedBooks.contains(book)) {
            System.out.println("대여한 책이 아닙니다.");
            return;
        }

        System.out.println(book.getTitle() + " 책을 반납합니다.");
        borrowedBooks.remove(book);
    }
}
