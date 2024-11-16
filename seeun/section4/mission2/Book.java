package section4.mission2;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String isBn;

    private Book(String title, String author, String isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
    }

    public static Book createBook (String title, String author, String isBn) {
        return new Book(title, author, isBn);
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

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", isBn: " + isBn;
    }
}
