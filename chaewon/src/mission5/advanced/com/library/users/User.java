package mission5.advanced.com.library.users;

import mission5.advanced.com.library.books.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String name;
    private List<Book> borrowBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public boolean borrowBook(Book book) {
        if (book == null) {
           throw new IllegalArgumentException("대여할 도서를 입력하세요.");
        }

        book.borrowBook();
        borrowBooks.add(book);

        return true;
    }

    public boolean returnBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("반납할 도서를 입력하세요.");
        }

        book.returnBook();
        borrowBooks.remove(book);

        return true;
    }

    public String displayBorrowdBooks(){
        if (borrowBooks.isEmpty()){
            return "대여 중인 도서가 없습니다.";
        }

        StringBuilder sb = new StringBuilder();

        return borrowBooks.stream()
                .map(Book::toString)
                .collect(Collectors.joining("\n"));

    }
}

