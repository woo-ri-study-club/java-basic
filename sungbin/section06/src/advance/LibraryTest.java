package advance;

import com.library.books.Book;
import com.library.users.User;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("자바 프로그래밍", "신짱구", "123456");
        Book book2 = new Book("자료구조", "김철수", "654321");

        User user = new User("홍길동");

        user.borrow(book1);
        user.borrow(book2);

        user.showBorrowedBooks();

        user.returnTo(book1);

        user.showBorrowedBooks();
    }
}
