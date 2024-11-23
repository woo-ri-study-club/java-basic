package advance;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println("제목: " + book.getTitle());
            System.out.println("직가: " + book.getAuthor());

            switch (book) {
                case EBook eBook -> System.out.println("형식: " + eBook.getFormat());
                case PrintedBook printedBook -> System.out.println("출판사: " + printedBook.getPublisher());
                default -> System.out.println("올바르지 않는 책 종류 입니다.");
            }

            System.out.println();
        }
    }
}
