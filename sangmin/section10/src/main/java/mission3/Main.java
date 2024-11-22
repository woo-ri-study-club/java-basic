package mission3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Harry Potter", "J.K. Rowling", 10000);
        EBook eBook = new EBook("Harry Potter", "J.K. Rowling", 10000, "100MB", "PDF");

        library.addBook(book);
        library.addBook(eBook);

        library.showAllBooks();
    }
}
