package mission12;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        validateBook(book);
        books.add(book);
    }

    public Book findByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 ISBN입니다."));
    }

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    private void validateBook(Book book) {
        boolean exists = books.stream()
                .anyMatch(existingBook -> existingBook.equals(book));
        if (exists) {
            throw new IllegalArgumentException("이미 존재하는 ISBN입니다.");
        }
    }
}
