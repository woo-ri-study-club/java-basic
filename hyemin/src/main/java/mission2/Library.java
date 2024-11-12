package mission2;

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

    public Book findBookByTitle(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new BookNotFoundException("책 '" + title + "'을 찾을 수 없습니다.");
    }

    public void printBookInfo(Book book){
        if (book == null) {
            throw new NullPointerException("책 정보를 찾을 수 없습니다.");
        }
        System.out.println(book);
    }
}
