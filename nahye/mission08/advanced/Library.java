package mission08.advanced;

public class Library {
    private final int MAX_BOOKS = 10;
    private Book[] books = new Book[MAX_BOOKS];
    private int count;

    public void addBook(Book book) {
        if (count > MAX_BOOKS) {
            System.out.println("책을 더이상 추가할 수 없습니다.");
            return;
        }
        books[count++] = book;
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

}
