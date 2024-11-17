package mission04;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Library {
    private Book[] books;

    public Library() {
        this(10);
    }

    public Library(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("0보다 작을 수 없습니다.");
        }
        this.books = new Book[length];
    }

    public Optional<Integer> findEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) return Optional.of(i);
        }
        return Optional.empty();
    }

    public boolean addBook(String title, String author, int publishedYear) {
        Optional<Integer> emptyIndex = findEmptyIndex();

        if (findEmptyIndex().isPresent()) {
            books[emptyIndex.get()] = new Book(title, author, publishedYear);
            return true;
        }
        System.out.println("더이상 도서를 추가 할 수 없습니다.");
        return false;
    }

    public void displayBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public void searchBookByTitle(String title) {
        System.out.println("=== '" + title + "' 검색 결과 ===");

        Optional<Book> findBook = findBookByTitle(title);
        findBook.ifPresentOrElse(
                book -> System.out.println(book),
                () -> System.out.println("해당 도서가 없습니다.")
        );
    }

    public Optional<Book> findBookByTitle(String title) {
        return Arrays.stream(books)
                .filter(Objects::nonNull)
                .filter(book -> book.hasSameTitle(title))
                .findFirst();
    }

}
