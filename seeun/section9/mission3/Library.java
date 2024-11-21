package section9.mission3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

    private static final int MAX_BOOKS = 10;
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (Objects.nonNull(book)) {
            checkSize();
            books.add(book);
        }
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private void checkSize() {
        if (books.size() >= MAX_BOOKS) {
            throw new IllegalStateException("더 이상 책을 추가할 수 없습니다.");
        }
    }
}
