package mission03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryManagerMedium {

    private List<Book> books = new ArrayList<>(
            Arrays.asList(
                    new Book("JAVA1","kim","1"),
                    new Book("JAVA1","kim","2"),
                    new Book("SPRING1","kim","3")
                    )
    );
    public static void main(String[] args) {

        LibraryManagerMedium library = new LibraryManagerMedium();

        library.addBook("SPRING2","kim","4");
        library.addBook("자료구조","Lee","5");
        library.displayAllBooks();

        library.searchBookByTitle("SPRING1");

        library.deleteBookByIsBn("4");
        library.displayAllBooks();
    }

    public void addBook(String title,String author, String isBn) {
        books.add(new Book(title,author,isBn));
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("제목이 " + title + "인 책이 있습니다.");
                return;
            }
        }
        System.out.println("제목이 " + title + "인 책이 없습니다.");
    }

    public void deleteBookByIsBn(String isBn){
        for (Book book : books) {
            if (book.getIsBn().equals(isBn)) {
                books.remove(book);
                System.out.println("책을 삭제합니다.");
                return;
            }
        }
        System.out.println("삭제할 수 있는 책이 없습니다.");
    }
}
