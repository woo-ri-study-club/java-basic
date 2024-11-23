package section12.mission3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        Objects.nonNull(book);
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
