package mission11.advanced;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private int maxBooks;

    public Library(int maxBooks) {
        if (maxBooks <= 0) {
            throw new IllegalArgumentException("최대 책 수는 0보다 커야 합니다.");
        }
        this.maxBooks = maxBooks;
    }

    public void addBook(Book book) {
        if (books.size() >= maxBooks) {
            throw new IllegalArgumentException("더 이상 책을 추가할 수 없습니다.");
        }
        if (book == null) {
            throw new IllegalArgumentException("책이 null일 수 없습니다.");
        }
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
