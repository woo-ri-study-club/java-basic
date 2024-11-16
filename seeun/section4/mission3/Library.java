package section4.mission3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class Library {

    private static List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static Library emptyLibrary() {
        return new Library();
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public boolean hasBook(Book findbook) {
        for (Book book : books) {
            if (book.equals(findbook)) {
                return true;
            }
        }
        return false;
    }

    public void removeBookByIsBn(String isBn) {
        for (Book book : books) {
            if (book.equalsByIsBn(isBn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoSuchElementException("해당 isBn의 도서가 존재하지 않습니다.");
    }

    public void showAvailableBook() {
        List<Book> availableBooks = books.stream()
                .filter(Book::isAvailable)
                .toList();

        if (availableBooks.isEmpty()) {
            System.out.println("현재 대출 가능한 도서가 없습니다.");
            return;
        }

        for (Book availableBook : availableBooks) {
            System.out.println(availableBook);
        }
    }

    public void checkOutBook(String searchValue) {
        Book foundBook = books.stream()
                .filter(book -> book.equalsByTitle(searchValue) ||
                        book.equalsByAuthor(searchValue) ||
                        book.equalsByIsBn(searchValue))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("관련한 도서가 존재하지 않습니다."));

        if (foundBook.isCheckedOut()) {
            throw new IllegalStateException("관련 도서는 대출 중입니다.");
        }
        foundBook.checkOutBook();
        System.out.println(searchValue + "도서 대출");
    }

    public void returnBook(String title, String author, String isBn) {
        Book returnBook = Book.createBook(title, author, isBn);

        Optional<Book> foundBook = books.stream()
                .filter(book -> book.equals(returnBook))
                .findFirst();

        if (foundBook.isEmpty()) {
            throw new NoSuchElementException("관련한 도서가 존재하지 않습니다.");
        }

        Book book = foundBook.get();
        if (book.isAvailable()) {
            throw new IllegalStateException("관련 도서는 대출 중이 아닙니다.");
        }

        book.returnBook();
        System.out.println("도서 반납 완료");
    }
}
