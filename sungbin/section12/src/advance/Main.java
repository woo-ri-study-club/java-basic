package advance;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new EBook("JPA", "kim", "PDF"));
        library.addBook(new PrintedBook("원피스", "오다", "오다 컴퍼니"));

        library.printAllBooks();
    }
}
