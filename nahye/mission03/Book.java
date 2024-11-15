package mission03;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isBn;

    public Book(String title, String author, String isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
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
    public String toString() {
        return "제목: "+title+", 저자: "+author+", ISBN: "+isBn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isBn, book.isBn);
    }

}
