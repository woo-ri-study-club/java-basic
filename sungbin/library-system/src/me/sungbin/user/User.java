package me.sungbin.user;

import me.sungbin.book.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private final String id;

    private final String name;

    private final String password;

    private final List<Book> loanedBooks = new ArrayList<>();

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public boolean notValidPassword(String password) {
        return !this.password.equals(password);
    }

    public void loan(Book book) {
        loanedBooks.add(book);
    }

    public void returns(Book book) {
        loanedBooks.remove(book);
    }

    public void displayLoanedBooks() {
        if (loanedBooks.isEmpty()) {
            System.out.println("대출한 책이 없습니다.");
        } else {
            loanedBooks.forEach(System.out::println);
        }
    }

    public abstract boolean isAdmin();
}
