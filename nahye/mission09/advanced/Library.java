package mission09.advanced;

import java.util.ArrayList;

public class Library {
    private final int maxBooks;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(int maxBooks) {
        this.maxBooks = maxBooks;
    }

    public void addBook(Book book) {
        if (books.size() >= maxBooks) {
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