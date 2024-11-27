package me.sungbin.book;

import me.sungbin.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BookManager {

    private final List<Book> books = new ArrayList<>();

    public void registerBookThrough(Scanner scanner) {
        System.out.print("책 제목: ");
        String title = scanner.nextLine();

        System.out.print("저자: ");
        String author = scanner.nextLine();

        System.out.print("isbn: ");
        String isbn = scanner.nextLine();

        if (books.stream().anyMatch(book -> book.getIsbn().equals(isbn))) {
            System.out.println("이미 존재하는 isbn 입니다.");
            return;
        }

        books.add(new Book(title, author, isbn));
        System.out.println("책이 등록되었습니다.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("등록된 책이 없습니다.");
        } else {
            books.forEach(System.out::println);
        }
    }

    public void loanBook(Scanner scanner, User user) {
        System.out.print("대출 할 책의 isbn: ");
        String isbn = scanner.nextLine();

        Optional<Book> book = findBookBy(isbn);

        if (book.isEmpty()) {
            System.out.println("해당 isbn의 책이 없습니다.");
            return;
        }

        if (book.get().isLoaned()) {
            System.out.println("해당 책은 이미 대출 중입니다.");
            return;
        }

        book.get().updateLoanStatusIs(true);
        user.loan(book.get());

        System.out.println("책 대출이 완료되었습니다.");
    }

    public void returnBook(Scanner scanner, User user) {
        System.out.print("반납 할 책의 isbn: ");
        String isbn = scanner.nextLine();

        Optional<Book> book = findBookBy(isbn);

        if (book.isEmpty()) {
            System.out.println("해당 isbn의 책이 없습니다.");
            return;
        }

        if (book.get().isNotLoaned()) {
            System.out.println("이 책은 대출된 상태가 아닙니다.");
            return;
        }

        book.get().updateLoanStatusIs(false);
        user.returns(book.get());

        System.out.println("책 반납이 완료되었습니다.");
    }

    public void displayLoanedBooks() {
        System.out.println("=== 대출 중인 책 목록 ===");

        books.stream()
                .filter(Book::isLoaned)
                .forEach(System.out::println);
    }

    public List<Book> getBooks() {
        return books;
    }

    private Optional<Book> findBookBy(String isbn) {
        return books.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst();
    }
}
