package mission05;

import mission05.com.library.books.Book;
import mission05.com.library.users.User;

public class LibraryTest {
    public static void main(String[] args) {

        Book[] books = {
                new Book("JAVA1","KIM", "001"),
                new Book("JAVA2","KIM", "001"),
                new Book("SPRING1","KIM", "001"),
                new Book("SPRING2","KIM", "001"),
                new Book("JPA1","KIM", "001"),
                new Book("JPA2","KIM", "001"),
                new Book("자료구조1","KIM", "001"),
        };

        User user1 = new User("회원1");
        user1.borrowBook("Java1", books);
        user1.borrowBook("Spring2",books);
        System.out.println(user1);

        user1.returnBook("java1");
        System.out.println(user1);

    }
}
