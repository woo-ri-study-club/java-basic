import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("자바의 정석", "남궁성", "1");
        Book book2 = new Book("자바의 정석2", "남궁성", "2");
        Book book3 = new Book("자바의 정석3", "남궁성", "3");

        addBook(books, book1);
        addBook(books, book2);
        addBook(books, book3);

        getAllBooks(books);

        existBook(books, "자바의 정석");

        deleteByIsbn(books, "1");

        existBook(books, "자바의 정석");
    }

    private static void deleteByIsbn(List<Book> books, String isbn) {
        books.removeIf(book -> book.isMatchedIsbn(isbn));
    }

    public static void addBook(List books, Book book) {
        books.add(book);
    }

    public static void getAllBooks(List books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public static void existBook(List books, String bookTitle) {
        if (isContainsByTitle(books, bookTitle)) {
            System.out.println("책이 존재합니다.");
            return;
        }
        System.out.println("책이 존재하지 않습니다.");
    }

    private static boolean isContainsByTitle(List<Book> books, String bookTitle) {
        return books.stream()
                .anyMatch(book -> book.isMatchedTitle(bookTitle));
    }
}
