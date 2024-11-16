package advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(String title, String author, String isbn) {
        Book newBook = new Book(title, author, isbn);

        if (books.contains(newBook)) {
            System.out.println("책이 이미 등록되었습니다.");
            return false;
        }

        books.add(newBook);
        return true;
    }

    public Optional<Book> searchByTitle(String title) {
        return books.stream().filter(book -> book.hasTitle(title)).findFirst();
    }

    public Optional<Book> searchByIsbn(String isbn) {
        return books.stream().filter(book -> book.hasIsbn(isbn)).findFirst();
    }

    public void checkOutBook(String isbn) {
        searchByIsbn(isbn).ifPresentOrElse(book -> {
            try {
                book.checkout();
                System.out.println("책이 대출되었습니다: " + book);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }, () -> System.out.println("책이 존재하지 않습니다."));
    }

    public void returnBook(String isbn) {
        searchByIsbn(isbn).ifPresentOrElse(book -> {
            try {
                book.returnBook();
                System.out.println("책이 반납되었습니다: " + book);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }, () -> System.out.println("책이 존재하지 않습니다."));
    }

    public List<Book> getBooks() {
        return books;
    }
}
