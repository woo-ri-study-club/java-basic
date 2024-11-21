package advance;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static final int MAX_BOOKS = 5;

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (books.size() < MAX_BOOKS) {
            books.add(book);
            return;
        }

        System.out.println("더 이상 책을 추가할 수 없습니다.");
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
