package mission8;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.addBook(new Book("소년이 온다", "한강"));
            library.addBook(new Book("1984", "George Orwell"));
            library.addBook(null);
            library.showBooks();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
