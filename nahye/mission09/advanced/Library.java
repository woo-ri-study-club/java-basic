package mission09.advanced;

import java.util.ArrayList;

public class Library {
    private final int MAX_BOOKS = 10;
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (books.size() >= MAX_BOOKS) {
            throw new IllegalArgumentException("책을 더이상 추가할 수 없습니다.");
        }
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }
}