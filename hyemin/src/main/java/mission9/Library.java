package mission9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        validateBook(book);
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }

    private void validateBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("유효한 책이 아닙니다.");
        }
    }
}
