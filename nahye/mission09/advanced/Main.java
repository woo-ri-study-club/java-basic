package mission09.advanced;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin", 45));
        library.addBook(new EBook("Effective Java", "Joshua Bloch", 50, "3MB", "PDF"));
        library.showAllBooks();
    }
}
