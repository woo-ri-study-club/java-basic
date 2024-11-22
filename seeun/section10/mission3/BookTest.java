package section10.mission3;

public class BookTest {

    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("켄트 백의 Tidy First?", "켄트 백", 20);
        EBook eBook = new EBook("책", "책저자", 30, 4, "PDF");

        library.addBook(book);
        library.addBook(eBook);
        library.showAllBooks();
    }
}
