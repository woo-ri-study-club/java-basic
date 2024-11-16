import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("자바의 정석", "남궁성", "1");
        Book book2 = new Book("자바의 정석2", "남궁성", "2");
        Book book3 = new Book("자바의 정석3", "남궁성", "3");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.getAllBooks();

        library.existBook("자바의 정석");

        library.deleteByIsbn("1");

        library.existBook("자바의 정석");
    }
}
