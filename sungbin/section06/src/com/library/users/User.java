package com.library.users;

import com.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrow(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + "님이 " + book.getTitle() + "의 책을 빌렸습니다.");
    }

    public void returnTo(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + "님이 " + book.getTitle() + "의 책을 반납했습니다.");
    }
    
    public void showBorrowedBooks() {
        System.out.println("=======" + name + "님이 빌린 책 목록 =======");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
