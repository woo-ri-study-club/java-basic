package mission11.advanced;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        EBook ebook = new EBook("홍길동전", "허균", "PDF");
        library.addBook(ebook);

        PrintedBook printedBook = new PrintedBook("해리포터", "JK롤링", "출판사");
        library.addBook(printedBook);

        library.displayBooks();
    }
}
