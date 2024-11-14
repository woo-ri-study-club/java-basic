package section3.mission3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {

    private final List<Book> books;

    private Library() {
        this.books = new ArrayList<>();
    }

    public static Library emptyLibrary() {
        return new Library();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    //대소문자 고려하지 않는 경우 나올 수 있는 2개 이상의 결과 고려해 List 리턴
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isTitle(title)) {
                result.add(book);
            }
        }

        if (result.isEmpty()) {
            throw new NoSuchElementException("제목이 " + title + "인 책을 찾을 수 없습니다.");
        }
        return result;
    }

    public void showLibrary() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
