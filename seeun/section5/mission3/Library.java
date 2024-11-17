package section5.mission3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Library {

    private Book[] books;
    private static final int DEFAULT_SIZE = 5;
    private static final int GROWTH_FACTOR = 2;
    private int currentSize = 0;

    public Library() {
        this(DEFAULT_SIZE);
    }

    public Library(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("크기는 0보다 커야 합니다.");
        }
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("null인 항목을 추가할 수 없습니다");
        }
        checkBooksSize();
        books[currentSize++] = book;
    }

    private void checkBooksSize() {
        if(books.length <= currentSize ){
            books = Arrays.copyOf(books, books.length * GROWTH_FACTOR);
        }
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
        for (int i=0; i<currentSize; i++) {
            System.out.println(books[i]);
        }
    }
}
