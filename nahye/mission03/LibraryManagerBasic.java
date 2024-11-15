package mission03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryManagerBasic {

    private List<String> books = new ArrayList<>(
            Arrays.asList("JAVA1", "JAVA2", "SPRING1")
    );
    public static void main(String[] args) {

        LibraryManagerBasic library = new LibraryManagerBasic();

        library.addBook("SPRING2");
        library.addBook("자료구조");

        library.displayAllBooks();

        library.searchBookByTItle("SPRING1");
    }

    public void addBook(String title) {
        books.add(title);
    }

    public void displayAllBooks() {
        for (String bookTitle : books) {
            System.out.println(bookTitle);
        }
    }

    public void searchBookByTItle(String title) {
        for (String bookTitle : books) {
            if (bookTitle.equalsIgnoreCase(title)) {
                System.out.println("제목이 " + bookTitle + "인 책이 있습니다");
                return;
            }
        }
        System.out.println("제목이 " + title + "인 책이 없습니다.");
    }

}
