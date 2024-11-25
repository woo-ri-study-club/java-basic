package mission12.book;

import mission12.user.User;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private User user;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.user = null;
    }

    public boolean hasSameTitle(String title) {
        return this.title.equals(title);
    }

    public void borrow(User user) {
        this.user = user;
    }


    public boolean isBorrowed() {
        if (this.user != null) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", ISBN: " + isbn + ",대출 가능 여부: " + (user == null ? "가능" : "불가능");
    }

    public void isReturn() {
        this.user = null;
    }

    public boolean isBorrowedBy(User user) {
        if (this.user == user) {
            return true;
        }
        return false;
    }

    public boolean hasSameIsbn(String isbn) {
        return this.isbn.equals(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
