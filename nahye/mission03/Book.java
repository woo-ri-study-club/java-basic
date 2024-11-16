package mission03;

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

    public Book(String title, String author, String isBn, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
        this.isCheckedOut = isCheckedOut;
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


    public boolean hasSameTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }

     public boolean hasSameIsbn(String isBn) {
        return this.isBn.equals(isBn);
    }


    public void checkout() {
        if (isCheckedOut) {
            throw new IllegalStateException("이미 대출된 도서입니다.");
        }
        this.isCheckedOut = true;
    }

    public void returnBook() {
        if (!isCheckedOut) {
            throw new IllegalStateException("이미 반납된 도서입니다.");
        }
        this.isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", ISBN: " + isBn + ", 대출가능: " + (isCheckedOut ? "불가" : "가능");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isBn, book.isBn);
    }

}
