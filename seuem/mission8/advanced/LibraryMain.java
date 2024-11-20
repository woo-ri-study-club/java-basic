package seuem.mission8.advanced;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Little Prince", "Grandpa"));
        library.addBook(new Book("Tadpole's promise", "Meepy meep"));

        library.showBook();
    }
}
