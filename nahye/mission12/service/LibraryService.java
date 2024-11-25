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

    public void addBook(String title, String author, String isbn) {

        if (checkAlreadyHasSameIsbn(isbn)) return;
        if (checkNullValues(title, author, isbn)) return;

        Book bookToAdd = new Book(title, author, isbn);

        books.add(bookToAdd);
        System.out.println("책이 등록되었습니다.");
    }

    public void borrowBookByTitle(StandardUser user, String titleToBorrow) {
        boolean bookFound = false;
        for (Book book : books) {
            if (book.hasSameTitle(titleToBorrow)) {
                bookFound = true;
                if (book.isNotBorrowed()) {
                    book.borrow();
                    book.enrollBorrowedId(user.getId());
                    user.enrollBorrowedBook(book);
                    System.out.println("책이 대출 되었습니다.");
                    break;
                } else {
                    System.out.println("이미 대출된 책입니다.");
                }
            }
        }
        if (!bookFound) {
            System.out.println("찾으시는 도서가 없습니다.");
        }
    }

    public void returnBookByTitle(StandardUser user, String titleToReturn) {
        boolean bookReturned = false;
        for (Book book : books) {
            if (book.hasSameTitle(titleToReturn) && book.isBorrowed()) {
                bookReturned = true;
                book.isReturn();
                user.removeBorrowedBook(book);
                System.out.println("책이 반납 되었습니다.");
                break;
            }
        }
        if (!bookReturned) {
            System.out.println("반납할 책이 아닙니다.");
        }
    }

    public void showBorrowedBookBy(StandardUser user) {
        boolean bookBorrowed = false;
        for (Book book : books) {
            if (book.isBorrowedBy(user.getId())) {
                bookBorrowed = true;
                System.out.println(book);
            }
        }
        if (!bookBorrowed) {
            System.out.println("대출한 책이 없습니다.");
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean checkAlreadyHasSameIsbn(String isbn) {
        for (Book book : books) {
            if(book.hasSameIsbn(isbn)){
                System.out.println("등록에 실패했습니다. 같은 isbn의 책이 있습니다.");
                return true;
            }
        }
        return false;
    }

    public boolean checkNullValues(String title, String author, String isbn) {
        if(title.trim().isEmpty() || author.trim().isEmpty() || isbn.trim().isEmpty()){
            System.out.println("모두 입력해주세요");
            return true;
        }
        return false;
    }

}
