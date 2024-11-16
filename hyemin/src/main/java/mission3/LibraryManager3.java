package mission3;

public class LibraryManager3 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(Book.createBook("해리포터와 마법사의 돌", "JK 롤링", "1"));
        library.addBook(Book.createBook("해리포터와 비밀의 방", "JK 롤링", "2"));
        library.addBook(Book.createBook("해리포터와 불의 잔", "JK 롤링", "3"));
        library.addBook(Book.createBook("해리포터와 마법사의 돌", "JK 롤링", "1"));

        System.out.println(library.findAvailableBook("1"));

        library.printAllBooks();
        library.removeBook("2");
        library.printAllBooks();

        try {
            library.checkOutBook("1");
            library.checkOutBook("1");
            library.returnBook("3");
            library.returnBook("1");
            library.checkOutBook("4");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
