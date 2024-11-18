package mission05.com.library.books;

import java.util.Arrays;
import java.util.Optional;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasSameTitle(String title){
        return this.title.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public static Optional<Book> findBookByTitle(String title, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book != null && book.hasSameTitle(title))
                .findFirst();
    }
}
