package mission5.advanced;

import mission5.advanced.com.library.books.Book;
import mission5.advanced.com.library.users.User;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("소년이 온다", "한강", "9788936434120");
        Book book2 = new Book("채식주의자", "한강", "9788936434595");

        User user = new User("홍길동");

        user.borrowBook(book1);
        System.out.println(user.displayBorrowdBooks());

        user.borrowBook(book2);
        System.out.println(user.displayBorrowdBooks());

        user.returnBook(book1);
        System.out.println(user.displayBorrowdBooks());
    }
}
