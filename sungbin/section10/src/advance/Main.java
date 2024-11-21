package advance;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert C. Martin", 45);
        EBook ebook = new EBook("Effective Java", "Joshua Bloch", 50, 3, "PDF");

        library.addBook(book);
        library.addBook(ebook);

        library.showAllBooks();
    }
}
