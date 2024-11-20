package mission9;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("해리포터와 마법사의 돌", "JK롤링", 15000));
        library.addBook(new Ebook("해리포터와 비밀의 방", "JK롤링", 16000,"3MB", "PDF"));
        library.addBook(new Ebook("해리포터와 비밀의 방", "JK롤링", 16000,"3MB", "PDF"));

        library.showAllBooks();
    }
}
