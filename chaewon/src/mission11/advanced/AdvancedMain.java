package mission11.advanced;

public class AdvancedMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book printedBook = new PrintedBook("소년이 온다", "한강", "창비");
        Book eBook = new EBook("채식주의자", "한강", "PDF");

        library.addBook(printedBook);
        library.addBook(eBook);

        library.displayBooks();
    }
}
