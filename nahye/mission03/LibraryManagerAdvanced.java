package mission03;

public class LibraryManagerAdvanced {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("SPRING2","kim","4");
        library.addBook("자료구조","Lee","5");
        library.displayAllBooks();

        library.searchBookByTitle("SPRING1");
        library.displayAvailableBooks();

        library.borrowBookByTitle("자료구조");
        library.borrowBookByTitle("C언어");

    }

}
