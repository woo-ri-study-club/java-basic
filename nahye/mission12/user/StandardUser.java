package mission12.user;

import mission12.book.Book;

import java.util.ArrayList;
import java.util.List;

public class StandardUser implements User {

    private String id;
    private String password;
    private String name;

    private List<Book> borrowedBooks = new ArrayList<>();

    public StandardUser(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public void enrollBorrowedBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public boolean hasBorrowedBook() {
        if (!this.borrowedBooks.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean hasUserById(String id) {
        return this.id.equals(id);
    }

    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String toString() {
        return "회원 ID: " + id +
                ", 회원 이름: " + name +
                ", 빌린 책: " + borrowedBooks;
    }

}
