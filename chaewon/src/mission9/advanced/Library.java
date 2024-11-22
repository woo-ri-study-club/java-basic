package mission9.advanced;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (isNull(book)) {
            throw new IllegalArgumentException("추가할 도서가 null입니다.");
        }

        books.add(book);
    }

    public void showAllBooks() {
        books.forEach(Book::displayDetails);
    }
}
