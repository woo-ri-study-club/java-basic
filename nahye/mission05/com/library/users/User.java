package mission05.com.library.users;

import mission05.com.library.books.Book;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class User {

    private String name;
    private Book[] borrowedBooks;
    private int count;
    private final int MAX_BOOKS = 10;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new Book[MAX_BOOKS];
    }

    public boolean borrowBook(String title, Book[] books) {
        if (count >= MAX_BOOKS) {
            throw new IllegalArgumentException("더 이상 책을 빌릴 수 없습니다.");
        }

        Book findBook = Book.findBookByTitle(title, books)
                .orElseThrow(() -> new IllegalArgumentException("해당 책을 찾을 수 없습니다."));

        borrowedBooks[count++] = findBook;
        return true;
    }

    public void returnBook(String title) {

        int index = IntStream.range(0,count)
                .filter(i -> borrowedBooks[i].hasSameTitle(title))
                .findFirst()
                .orElse(-1);

        if(index == -1){
            throw new IllegalArgumentException("반납할 책이 없습니다.");
        }

        String returnedBookTitle = borrowedBooks[index].getTitle();
        
        for (int i = index; i < count - 1; i++) {
            borrowedBooks[i] = borrowedBooks[i + 1];
        }
        borrowedBooks[count - 1] = null;
        count--;

        System.out.println(returnedBookTitle+"이(가) 반납되었습니다.");
    }

    @Override
    public String toString() {
        return name+"님이 빌리신 책은 "
                + Arrays.stream(borrowedBooks)
                .map(Book::getTitle)
                .limit(count)
                .collect(Collectors.joining(", "))
                + " 입니다.";
    }
}
