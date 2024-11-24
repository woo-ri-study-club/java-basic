package mission12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BorrowingService {
    private Map<User, List<Book>> borrowedBooks = new HashMap<>();
    private BookRepository bookRepository;

    public BorrowingService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void borrowBook(User user, String isbn) {
        Book book = bookRepository.findByIsbn(isbn);
        if (!book.isAvailable()) {
            throw new IllegalStateException("대출 불가능한 책입니다.");
        }
        book.setAvailable(false);
        borrowedBooks.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
    }

    public void returnBook(User user, String isbn) {
        Book bookToReturn = bookRepository.findByIsbn(isbn);
        List<Book> borrowed = borrowedBooks.get(user);

        if (borrowed == null || !borrowed.contains(bookToReturn)) {
            throw new IllegalArgumentException("대출하지 않은 책입니다.");
        }

        bookToReturn.setAvailable(true);
        borrowed.remove(bookToReturn);
    }

    public List<Book> getBorrowedBooks(User user) {
        return borrowedBooks.getOrDefault(user, new ArrayList<>());
    }

    public Map<User, List<Book>> getAllBorrowingStatus() {
        return new HashMap<>(borrowedBooks);
    }
}
