package seuem.mission8.advanced;

public class Library {
    static final int MAX_BOOKS=1000;
    private Book[] books = new Book[MAX_BOOKS];
    int bookCount=0;

    public void addBook(Book book) {
        if (bookCount>=MAX_BOOKS){
            throw new IllegalStateException("최대 도서 수를 초과하였습니다. 추가할수없습니다.");
        }
        books[bookCount] = book;
        bookCount++;
    }
    public void showBook() {
        for (int i=0; i<bookCount;i++) {
            System.out.printf("%s by %s \n",books[i].title,books[i].author);
        }
    }
}
