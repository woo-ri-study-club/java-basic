package mission3;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        addBook(books, Book.createBook("해리포터와 마법사의 돌", "JK 롤링", "1"));
        addBook(books, Book.createBook("해리포터와 비밀의 방", "JK 롤링", "2"));
        addBook(books, Book.createBook("해리포터와 불의 잔", "JK 롤링", "3"));

        System.out.println(hasBook(books, "해리포터와 비밀의 방"));
        System.out.println(hasBook(books, "볼드모트와 비밀의 방"));

        printAllBooks(books);
        removeBook(books, "2");
        printAllBooks(books);
    }

    private static void addBook(List<Book> books, Book book) {
        books.add(book);
    }

    private static void printAllBooks(List<Book> books){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static boolean hasBook(List<Book> books, String bookToFind) {
        for (Book book : books) {
            if (book.matchName(bookToFind)) {
                return true;
            }
        }
        return false;
    }

    private static void removeBook(List<Book> books, String isBn) {
        books.removeIf(book -> book.matchIsBn(isBn));
    }
}
