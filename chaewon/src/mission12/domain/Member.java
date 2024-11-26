package mission12.domain;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String userName, String userId, String password) {
        super(userName, userId, password);
    }

    public void borrowedBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book findBook) {
        borrowedBooks.remove(findBook);
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
}
