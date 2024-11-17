package mission04;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(8);

        library.addBook("자료구조1", "KIM", 1999);
        library.addBook("자료구조2", "KIM", 1999);
        library.addBook("스프링1", "KIM", 1999);
        library.addBook("스프링2", "KIM", 1999);
        library.addBook("JAVA1", "KIM", 1999);
        library.addBook("JAVA2", "KIM", 1999);
        library.displayBooks();

        library.searchBookByTitle("JAVA1");
        library.searchBookByTitle("자료구조1");
    }
}
