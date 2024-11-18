package section6.mission3.com.library.books;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isCheckOut;

    private Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckOut = false;
    }

    public static Book createBook(String title, String author, String isbn) {
        return new Book(title, author, isbn);
    }

    public void checkOutBook() {
        isCheckOut = true;
    }

    public void returnBook() {
        isCheckOut = false;
    }

    public boolean isAvailable() {
        return !isCheckOut;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", isbn: " + isbn;
    }

}
