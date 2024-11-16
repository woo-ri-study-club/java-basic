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
        return findBookByName(name).orElseThrow(() -> new IllegalArgumentException("해당 도서를 보유하고 있지 않습니다."));
    }

    private void validateBook(Book book) {
        requireBookNotNull(book);
        requireFreeSpace();
        requireNotStoredYet(book);
    }

    private void requireBookNotNull(Book book) {
        if(book == null) throw new IllegalArgumentException("유효하지 않은 도서입니다 (Null)");
    }

    private void requireFreeSpace(){
        if (count >= books.length) {
            throw new IndexOutOfBoundsException("추가 가능한 도서 범위를 초과했습니다.");
        }
    }

    private void requireNotStoredYet(Book book) {
        findBookByName(book.getName()).ifPresent(
                foundBook -> {throw new IllegalArgumentException("이미 존재하는 도서입니다.");}
        );
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
