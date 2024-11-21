package mission8;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static final int MAX_BOOKS = 100;

    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        validateBook(book);
        validateCount();
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private void validateCount(){
        if (books.size() >= MAX_BOOKS) {
            throw new IllegalStateException("수용 가능한 도서 수를 초과하여, 책을 추가할 수 없습니다.");
        }
    }

    private void validateBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("유효하지 않은 도서입니다.");
        }
    }
}
