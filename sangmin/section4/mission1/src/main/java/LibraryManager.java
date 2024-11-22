import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        addBook(books, "자바의 정석");
        addBook(books, "자바의 정석2");
        addBook(books, "자바의 정석3");
        getAllBooks(books);
        existBook(books, "자바의 정석");
    }

    public static void addBook(List books, String bookName) {
        books.add(bookName);
    }

    public static void getAllBooks(List books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public static void existBook(List books, String bookName) {
        if (isContainsByBookName(books, bookName)) {
            System.out.println("책이 존재합니다.");
            return;
        }
        System.out.println("책이 존재하지 않습니다.");
    }

    private static boolean isContainsByBookName(List books, String bookName) {
        return books.contains(bookName);
    }
}
