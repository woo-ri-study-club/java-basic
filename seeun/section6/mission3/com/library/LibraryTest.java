package section6.mission3.com.library;

import section6.mission3.com.library.books.Book;
import section6.mission3.com.library.users.User;

import static section6.mission3.com.library.books.Book.createBook;
import static section6.mission3.com.library.users.User.createUser;

public class LibraryTest {

    public static void main(String[] args) {

        User user1 = createUser("이이");

        Book book1 = createBook("이이를위한책", "우우", "001");
        Book book2 = createBook("김김을위한책", "디디", "002");
        Book book3 = createBook("박박을위한책", "사사", "003");

        user1.checkOutBook(book2);
        user1.ShowCheckedOutbooks();
        System.out.println();

        user1.checkOutBook(book3);
        user1.ShowCheckedOutbooks();
        System.out.println();

        user1.returnBook(book3);
        user1.ShowCheckedOutbooks();


    }

}
