package section9.mission3;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("소년이 온다", "한강"));
        library.addBook(new Book("1984", "George Orwell"));
        library.showBooks();
    }
}
