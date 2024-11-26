package mission12.manager;

import mission12.domain.Book;
import mission12.domain.Member;
import mission12.domain.User;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class BookManager {
    private final List<Book> bookRepository = new ArrayList<>();

    public void addBook(Book book){
        if (isNull(book)){
            throw new IllegalArgumentException("User는 null일 수 없습니다.");
        }

        bookRepository.add(book);
    }

    public void displayAllBooks(){
        if (bookRepository.isEmpty()){
            System.out.println("도서가 존재하지 않습니다.");
            return;
        }

        bookRepository.forEach(System.out::println);
    }

    public Book findBookByIsbn(String isbn){
        return bookRepository.stream()
                .filter(book -> book.isIsbnSame(isbn))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 ISBN에 해당하는 도서가 존재하지 않습니다."));
    }

    public void borrowBook(Member member, String isbn){
        Book findBook = findBookByIsbn(isbn);

        if (findBook.cannotBorrowed()){
            System.out.println("대출이 가능한 도서가 아닙니다.");
            return;
        }

        if(findBook.canBorrowed()){
            findBook.borrowedBook();
            member.borrowedBook(findBook);
        }
    }

    public void returnBook(Member member, String isbn){
        Book findBook = findBookByIsbn(isbn);

        if (findBook.canBorrowed()){
            System.out.println("반납이 가능한 도서가 아닙니다.");
            return;
        }

        if(findBook.cannotBorrowed()){
            findBook.returnBook();
            member.returnBook(findBook);
        }
    }

    public void displayBorrowedBooks() {
        List<Book> canNotBorrowedBooks = bookRepository.stream()
                .filter(Book::cannotBorrowed)
                .toList();

        if (canNotBorrowedBooks.isEmpty()){
            System.out.println("대출 중인 도서가 존재하지 않습니다.");
            return;
        }

        canNotBorrowedBooks.forEach(System.out::println);
    }
}
