package section10.mission3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        Objects.requireNonNull(book);
        books.add(book);
    }
    public void showAllBooks() {
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }
}
