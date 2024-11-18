package section6.mission3.com.library.users;

import section6.mission3.com.library.books.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private List<Book> checkedOutbooks;

    private User(String name) {
        this.name = name;
        checkedOutbooks = new ArrayList<>();
    }

    public static User createUser(String name) {
        return new User(name);
    }

    public void checkOutBook(Book book){
        Objects.requireNonNull(book, "책은 null일 수 없습니다.");

        if (book.isCheckOut()) {
            throw new IllegalStateException("대출 중인 도서입니다.");
        }

        book.checkOutBook();
        checkedOutbooks.add(book);
    }

    public void returnBook(Book book){
        Objects.requireNonNull(book, "책은 null일 수 없습니다.");

        if (book.isAvailable()) {
            throw new IllegalStateException("대출 되지 않은 도서입니다.");
        }

        book.returnBook();
        checkedOutbooks.remove(book);
    }

    public void ShowCheckedOutbooks() {
        for (Book checkedOutbook : checkedOutbooks) {
            System.out.println(checkedOutbook);
        }
    }
}
