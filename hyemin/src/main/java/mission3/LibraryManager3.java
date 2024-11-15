package mission3;

public class LibraryManager3 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(Book.createBook("해리포터와 마법사의 돌", "JK 롤링", "1"));
        library.addBook(Book.createBook("해리포터와 비밀의 방", "JK 롤링", "2"));
        library.addBook(Book.createBook("해리포터와 불의 잔", "JK 롤링", "3"));

        System.out.println(library.hasBook("해리포터와 비밀의 방"));
        System.out.println(library.hasBook("볼드모트와 비밀의 방"));

        library.printAllBooks();
        library.removeBook("2");
        library.printAllBooks();

        library.checkOutBook("1");
        library.returnBook("3");
        library.returnBook("1");
    }
}
