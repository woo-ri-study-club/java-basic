package mission3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public boolean hasBook(String bookToFind) {
        for (Book book : books) {
            if (book.getName().equals(bookToFind)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(String isBn) {
        books.removeIf(book -> book.getIsBn().equals(isBn));
    }

    public Optional<Book> findBook(String isBn) {
        return books.stream()
                .filter(book -> book.getIsBn().equals(isBn))
                .findFirst();
    }

    public void checkOutBook(String isBn) {
        Optional<Book> bookOpt = findBook(isBn);
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            if (book.isCheckedOut()) {
                System.out.println("해당 도서는 이미 대출되었습니다.");
            } else {
                book.checkOut();
                System.out.println(book.getName() + " 도서가 대출되었습니다.");
            }
        } else {
            System.out.println("해당 ISBN의 도서가 존재하지 않습니다.");
        }
    }

    public void returnBook(String isBn) {
        Optional<Book> bookOpt = findBook(isBn);
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            if (!book.isCheckedOut()) {
                System.out.println("해당 도서 대출 기록이 없습니다.");
            } else {
                book.returnBook();
                System.out.println(book.getName() + " 도서가 반납되었습니다.");
            }
        } else {
            System.out.println("해당 ISBN의 도서가 존재하지 않습니다.");
        }
    }
}
