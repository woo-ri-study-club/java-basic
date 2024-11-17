package mission4;

import java.util.Optional;

public class Library {
    private Book[] books;
    int count;

    public Library() {
        this(Integer.MAX_VALUE);
    }

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        validateBook(book);
        books[count++] = book;
    }

    public Book getBookByName(String name) {
        return findBookByName(name).orElseThrow(
                () -> new LibraryException(ErrorCode.BOOK_NOT_FOUND)
        );
    }

    private void validateBook(Book book) {
        requireBookNotNull(book);
        requireFreeSpace();
        requireNotStoredYet(book);
    }

    private void requireBookNotNull(Book book) {
        if(book == null)
            throw new LibraryException(ErrorCode.REQUIRE_NOT_NULL_NOT_EMPTY, "유효하지 않은 도서입니다.");
    }

    private void requireFreeSpace(){
        if (count >= books.length) {
            throw new LibraryException(ErrorCode.BOOK_LIMIT_EXCEEDED);
        }
    }

    private void requireNotStoredYet(Book book) {
        findBookByName(book.getName()).ifPresent(existingBook -> {
            if (existingBook.equals(book)) {
                throw new IllegalArgumentException("이미 존재하는 도서입니다.");
            }
        });
    }

    private Optional<Book> findBookByName(String name) {
        for (Book book : books) {
            if (book != null && book.matchName(name)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
