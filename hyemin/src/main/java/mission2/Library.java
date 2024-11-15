package mission2;

import java.util.Optional;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("추가 가능한 범위를 초과했습니다.");
        }
    }

    public Optional<Book> findBookByTitle(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public void printBookInfo(Optional<Book> optionalBook){
        optionalBook.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("책 정보를 찾을 수 없습니다.")
        );
    }

    public void printBookDetails(String title) {
        try {
            Optional<Book> book = findBookByTitle(title);
            printBookInfo(book);
        } catch (BookNotFoundException e) {
            System.out.println("BookNotFoundException: " + e.getMessage());
        }

    }
}
