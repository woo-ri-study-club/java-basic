package mission5.com.library.users;

import mission5.com.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<Book> loanedBooks;

    public User(String name) {
        validateInput(name, "사용자 이름");
        this.name = name;
        this.loanedBooks = new ArrayList<>();
    }

    public void loanBook(Book book) {
        validateBook(book, true);
        loanedBooks.add(book);
        System.out.printf("%s님이 '%s'를 빌렸습니다.%n", name, book);
    }

    public void returnBook(Book book) {
        validateBook(book, false);
        loanedBooks.remove(book);
        System.out.printf("%s님이 '%s'를 반납했습니다.%n", name, book);
    }

    public void printBorrowedBooks() {
        if (loanedBooks.isEmpty()) {
            System.out.println(name + "님은 현재 빌린 책이 없습니다.");
        } else {
            System.out.println(name + "님의 대여 목록:");
            for (Book book : loanedBooks) {
                System.out.println(book);
            }
        }
    }

    private void validateInput(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + "은 null이거나 비어 있을 수 없습니다.");
        }
    }

    private void validateBook(Book book, boolean isLoan) {
        if (book == null) {
            throw new IllegalArgumentException((isLoan ? "빌릴" : "반납할") + " 책이 null입니다.");
        }

        if (isLoan && loanedBooks.contains(book)) {
            throw new IllegalArgumentException("이미 빌린 책입니다: " + book);
        }

        if (!isLoan && !loanedBooks.contains(book)) {
            throw new IllegalArgumentException("빌린 목록에 '%s'가 없습니다.".formatted(book));
        }
    }
}
