package mission3.advanced;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book newBook) {
            for (Book book : books) {
                if (newBook.equals(book)) {
                    throw new IllegalArgumentException("이미 추가된 도서 혹은 등록된 ISBN입니다.");
                }
            }

            if (newBook != null) {
                books.add(newBook);
            }
    }

    public List<Book> readAllBooks() {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("도서 목록이 비어있습니다.");
        }

        return books;
    }

    public List<Book> searchBook(String title) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.isTitleContaining(title)) {
                foundBooks.add(book);
            }
        }

        if (foundBooks.isEmpty()) {
            throw new IllegalArgumentException("검색하신 키워드를 포함하는 도서가 없습니다.");
        }

        return foundBooks;
    }

    public List<Book> readBooksCanBeLoaned() {
        List<Book> foundBooks = new ArrayList<>();

        for (Book book:books){
            if (book.canBeLoaned()){
                foundBooks.add(book);
            }
        }

        if (foundBooks.isEmpty()) {
            throw new IllegalArgumentException("대출 가능한 도서가 없습니다.");
        }

        return foundBooks;
    }

    public void deleteBook(String isbn) {
        boolean isRemoved = books.removeIf(book -> book.isSameIsbn(isbn));

        if (!isRemoved){
            throw new IllegalArgumentException("해당 ISBN 도서가 존재하지 않습니다.");
        }
    }

    public void loanBook(List<Book> availableBooks, String isbn) {
        for (Book book:availableBooks){
            if (book.isSameIsbn(isbn)){
                book.updateIsCheckedToTrue();
                return;
            }
        }

        throw new IllegalArgumentException("존재하지 않거나 대출 가능한 도서가 아닙니다.");
    }
}
