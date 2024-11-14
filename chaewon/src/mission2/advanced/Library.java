package mission2.advanced;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[]{};
    }

    public void addBook(Book book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        books[books.length - 1] = book;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.isTitleSame(title)) {
                return book;
            }
        }

        throw new IllegalArgumentException("검색하신 제목과 동일한 도서가 존재하지 않습니다.");
    }

}
