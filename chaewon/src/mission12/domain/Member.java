package mission12.domain;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String userName, String userId, String password, List<Book> borrowedBooks) {
        super(userName, userId, password);
        this.borrowedBooks = borrowedBooks;
    }
}
