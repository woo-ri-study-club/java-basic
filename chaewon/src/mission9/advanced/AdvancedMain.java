package mission9.advanced;

public class AdvancedMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("소년이 온다", "한강", 15000));
        library.addBook(new EBook("1984", "George Orwell", 11000, 2000, "PDF"));
        library.addBook(new EBook("채식주의자", "한강", 15000, 2500, "PDF"));

        library.showAllBooks();
    }
}
