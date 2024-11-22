package advance;

import java.util.Arrays;

public class Library {

    private Book[] books;

    private int capacity;

    private int size;

    public Library(int capacity) {
        this.capacity = capacity;

        books = new Book[this.capacity];
        this.size = 0;

        add(new Book("JPA", "kim"));
        add(new Book("Spring", "lee"));
        add(new Book());
    }

    public void add(Book book) {
        if (size >= capacity) {
            System.out.println("용량을 초과했습니다. 도서관 용량을 늘려주세요.");
            return;
        }
        books[size++] = book;
    }

    public void showBookTitle(int bookNumber) {
        if (bookNumber < 1 || bookNumber > capacity) {
            System.out.println("잘못된 책 번호입니다.");
            return;
        }

        Book selectedBook = books[bookNumber - 1];
        System.out.println("책 제목: " + selectedBook.getTitle());
    }

    public void expandCapacity(int newCapacity) {
        if (newCapacity <= capacity) {
            System.out.println("새 용량은 현재 용량보다 커야 합니다.");
            return;
        }
        capacity = newCapacity;
        books = Arrays.copyOf(books, capacity);
        System.out.println("도서관 용량이 " + capacity + "권으로 확장되었습니다.");
    }
}
