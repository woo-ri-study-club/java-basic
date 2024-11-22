package section10.advenced;

public class LibraryMain {

  public static void main(String[] args) {
    Library library = new Library(100);
    Book book1 = new Book("Clean Code", "Robert C. Martin", 45);
    EBook book2 = new EBook("Effective Java", "Joshua Bloch", 50, "3MB", "PDF");

    library.addBook(book1);
    library.addBook(book2);

    library.showAllBooks();
  }
}
