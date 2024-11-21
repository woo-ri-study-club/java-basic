package mission3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final int MAX_BOOKS = 5;
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (books.size() >= MAX_BOOKS) {
            throw new IllegalStateException("책은 최대 5권까지만 추가할 수 있습니다.");
        }
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            book.showBook();
        }
    }
}
