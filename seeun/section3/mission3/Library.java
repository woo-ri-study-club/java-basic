package section3.mission3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Library {

    private Book[] books;
    private int currentSize = 0;
    private int capacity = 5;

    private Library() {
        this.books = new Book[capacity];
    }

    public static Library emptyLibrary() {
        return new Library();
    }

    public void addBook(Book book) {
        if(currentSize >= capacity){
            capacity *= 2;
            books = Arrays.copyOf(books, capacity);
        }
        books[currentSize++] = book;
    }

    public Book[] findByTitle(String title) {
        Book[] findBooks = new Book[currentSize];
        int count = 0;

        for (Book book : books) {
            if(book == null){
                break;
            }
            if (book.isTitle(title)) {
                findBooks[count++] = book;
            }
        }

        if (count == 0) {
            throw new NoSuchElementException("제목이 " + title + "인 책을 찾을 수 없습니다.");
        }

        return Arrays.copyOf(findBooks, count);
    }

    public void showLibrary() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
