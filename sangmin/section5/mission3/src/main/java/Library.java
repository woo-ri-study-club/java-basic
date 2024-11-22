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

    public Book searchBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.matchedTitle(title))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 제목의 책이 없습니다."));
    }
}
