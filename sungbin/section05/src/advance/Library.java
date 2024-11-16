package advance;

import java.util.Arrays;
import java.util.Optional;

public class Library {

    private Book[] books;

    private int booksCount;

    private static final int DEFAULT_LIBRARY_SIZE = 10;

    public Library() {
        this(DEFAULT_LIBRARY_SIZE);
    }

    public Library(int size) {
        books = new Book[size];
        booksCount = 0;
    }

    public void add(Book book) {
        if (booksCount < books.length) {
            books[booksCount++] = book;
        } else {
            System.out.println("책을 더 이상 추가할 수 없습니다.");
        }
    }

    public Optional<Book> findBookBy(String title) {
        return Arrays.stream(books)
                .filter(book -> book.is(title))
                .findFirst();
    }

}
