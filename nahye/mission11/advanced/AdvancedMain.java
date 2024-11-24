package mission11.advanced;

public class AdvancedMain {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new EBook("BOOK1", "KIM", "PDF"));
        library.addBook(new PrintedBook("BOOK2", "KIM", "문학과 지성사"));
        library.addBook(new PrintedBook("BOOK3", "LEE", "창비"));

        library.displayAllBooks();
    }
}
