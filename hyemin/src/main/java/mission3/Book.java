package mission3;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private String isBn;
    private boolean isCheckedOut;

    private Book(String name, String author, String isBn) {
        this.name = name;
        this.author = author;
        this.isBn = isBn;
    }

    public static Book createBook(String name, String author, String isBn) {
        return new Book(name, author, isBn);
    }

    public String getName() {
        return name;
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

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isBn, book.getIsBn());
    }

    @Override
    public String toString() {
        return String.format("도서명: %s, 저자: %s, isBn: %s", name, author, isBn);
    }
}
