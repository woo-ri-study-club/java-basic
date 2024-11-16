package mission3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void removeBook(String isBn) {
        books.removeIf(book -> book.matchIsBn(isBn));
    }

    public Book findAvailableBook(String isBn) {
        return books.stream()
                .filter(book -> book.matchIsBn(isBn) && !book.isCheckedOut())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 ISBN의 도서가 존재하지 않습니다."));
    }

    public void checkOutBook(String isBn) {
        handleBookCheckOut(findAvailableBook(isBn));
    }

    public void returnBook(String isBn) {
        handeBookReturn(findAvailableBook(isBn));
    }

    private void handleBookCheckOut(Book book) {
        String checkedOutBook = book.checkOut();
        System.out.println(checkedOutBook + " 도서가 대출되었습니다.");
    }

    private void handeBookReturn(Book book) {
        String returnedBook = book.returnBook();
        System.out.println(returnedBook + " 도서가 반납되었습니다.");
    }
}
