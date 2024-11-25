package mission12.service;

import mission12.book.Book;
import mission12.user.StandardUser;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private final List<Book> books = new ArrayList<>();

    public LibraryService() {
        initializeData();
    }

    private void initializeData() {
        books.add(new Book("book1", "kim", "1111"));
        books.add(new Book("book2", "kim", "2222"));
        books.add(new Book("book3", "kim", "3333"));
    }

    public void addBook(Book book) {
        if (checkAlreadyHasSameIsbn(book.getIsbn()))
            return;
        if (checkNullValues(book.getTitle(), book.getAuthor(), book.getIsbn()))
            return;

        books.add(book);
        System.out.println("책이 등록되었습니다.");
    }

    public void borrowBookByTitle(StandardUser user, String title) {
        Book bookFound = findByTitle(title);
        if (bookFound == null) {
            System.out.println("찾으시는 도서가 없습니다.");
            return;
        }
        if (bookFound.isBorrowed()) {
            System.out.println("이미 대출된 책입니다.");
            return;
        }
        bookFound.borrow(user);
        user.enrollBorrowedBook(bookFound);
        System.out.println("책이 대출 되었습니다.");
    }

    public void returnBookByTitle(StandardUser user, String title) {
        Book bookFound = findByTitle(title);
        if (bookFound == null) {
            System.out.println("반납할 책이 아닙니다.");
            return;
        }
        bookFound.isReturn();
        user.removeBorrowedBook(bookFound);
        System.out.println("책이 반납 되었습니다.");
    }

    public void showBorrowedBookBy(StandardUser user) {
        boolean bookBorrowed = false;
        for (Book book : books) {
            if (book.isBorrowedBy(user)) {
                bookBorrowed = true;
                System.out.println(book);
            }
        }
        if (!bookBorrowed) {
            System.out.println("대출한 책이 없습니다.");
        }
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.hasSameTitle(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public boolean checkAlreadyHasSameIsbn(String isbn) {
        for (Book book : books) {
            if (book.hasSameIsbn(isbn)) {
                System.out.println("등록에 실패했습니다. 같은 isbn의 책이 있습니다.");
                return true;
            }
        }
        return false;
    }

    public boolean checkNullValues(String title, String author, String isbn) {
        if (title.trim().isEmpty() || author.trim().isEmpty() || isbn.trim().isEmpty()) {
            System.out.println("모두 입력해주세요");
            return true;
        }
        return false;
    }

}
