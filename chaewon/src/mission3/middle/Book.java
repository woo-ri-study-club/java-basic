package mission3.middle;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static Book createBook(String title, String author, String isbn) {
        if (title.isBlank() || author.isBlank() || isbn.isBlank()) {
            System.out.println("도서명, 작가, ISBN 필드를 모두 입력해야 합니다.");
            return null;
        }

        return new Book(title, author, isbn);
    }

    public boolean isTitleContaining(String title) {
        return this.title.toLowerCase().contains(title);
    }

    public boolean isSameIsbn(String isbn) {
        return isbn.equalsIgnoreCase(this.isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn);
    }

    @Override
    public String toString() {
        return "도서명:'" + title + '\'' +
                ", 작가:'" + author + '\'' +
                ", ISBN:'" + isbn + '\'';
    }
}
