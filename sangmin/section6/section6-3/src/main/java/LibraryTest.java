import com.library.books.Book;
import com.library.users.User;

public class LibraryTest {
    public static void main(String[] args) {
        User user = new User("John");
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0544003415");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "978-0747532743");

        user.borrowBook(book1);
        user.borrowBook(book2);

        user.returnBook(book2);
    }
}
