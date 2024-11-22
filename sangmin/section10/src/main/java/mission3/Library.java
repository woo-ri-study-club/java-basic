package mission3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(final Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.showDetails();
        }
    }
}
