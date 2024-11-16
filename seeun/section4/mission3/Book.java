package section4.mission3;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String isBn;
    private boolean isCheckedOut;

    public Book(String title, String author, String isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
        this.isCheckedOut = false;
    }

    public static Book createBook (String title, String author, String isBn) {
        return new Book(title, author, isBn);
    }

    public boolean isAvailable() {
        return !isCheckedOut;
    }

    public void checkOutBook() {
        this.isCheckedOut = true;
    }

    public void returnBook(){
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsBn() {
        return isBn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isBn, book.isBn);
    }

    public boolean equalsByIsBn(String isBn) {
        return Objects.equals(this.isBn, isBn);
    }

    public boolean equalsByTitle(String title) {
        return Objects.equals(this.title, title);
    }

    public boolean equalsByAuthor(String author) {
        return Objects.equals(this.author, author);
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", isBn: " + isBn;
    }
}
