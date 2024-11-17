package mission5;

import mission5.com.library.books.Book;
import mission5.com.library.users.User;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("해리포터와 마법사의 돌", "JK 롤링", "1");
        Book book2 = new Book("해리포터와 비밀의 방", "JK 롤링", "2");

        User user = new User("김혜민");

        try {
            user.loanBook(book1);
            user.loanBook(book2);
            user.loanBook(book1); // 예외 발생: 이미 빌린 책
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        user.printBorrowedBooks();

        try {
            user.returnBook(book1);
            user.returnBook(book2);
            user.returnBook(book2); // 예외 발생: 반납할 책이 빌린 목록에 없음
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        user.printBorrowedBooks();
    }
}
