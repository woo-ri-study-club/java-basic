package section12.mission3;

public class BookMain {

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new EBook("책1", "책1저자", "PDF");
        Book book2 = new PrintedBook("책1", "책1저자", "책1출판");

        library.addBook(book1);
        library.addBook(book2);
        library.printBooks();
    }
}
