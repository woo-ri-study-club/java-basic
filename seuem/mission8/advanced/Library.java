package seuem.mission8.advanced;

import java.util.ArrayList;
import java.util.List;

public class Library {
    static final int MAX_BOOKS=1000;
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (books.size()>=MAX_BOOKS){
            throw new IllegalStateException("최대 도서 수를 초과하였습니다. 추가할수없습니다.");
        }
        books.add(book);
    }
    public void showBook() {
        for (Book book : books) {
            book.showInfo();
        }
    }
}
