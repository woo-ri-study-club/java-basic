package mission4.advanced;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.stream;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        this.books = new Book[size];
    }

    public boolean addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("추가하려는 도서가 없습니다.");
        }
        if (count >= books.length) {
            System.out.println("용량이 부족합니다.");
            return false;
        }

        books[count++] = book;
        return true;
    }

    public List<Book> searchBook(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("검색 키워드를 입력하세요.");
        }

        List<Book> foundBooks = stream(books).filter(Objects::nonNull)
                .filter(book -> book.isSameTitle(title))
                .toList();

        if (foundBooks.isEmpty()) {
            throw new IllegalArgumentException("검색한 도서명과 일치하는 도서가 없습니다.");
        }

        return foundBooks;
    }
}
