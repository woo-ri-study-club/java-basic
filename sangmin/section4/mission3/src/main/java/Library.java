import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void getAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public void existBook(String bookTitle) {
        if (isContainsByTitle(bookTitle)) {
            System.out.println("책이 존재합니다.");
            return;
        }
        System.out.println("책이 존재하지 않습니다.");
    }

    public void deleteByIsbn(String isbn) {
        books.removeIf(book -> book.isMatchedIsbn(isbn));
    }

    private boolean isContainsByTitle(String bookTitle) {
        return books.stream()
                .anyMatch(book -> book.isMatchedTitle(bookTitle));
    }
}
