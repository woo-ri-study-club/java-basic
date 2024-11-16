package mission04;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[10];
    }
    public Library(int length) {
        this.books = new Book[length];
    }

    public void addBook(String title, String author, int publishedYear) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(title, author, publishedYear);
                return;
            }
        }
        System.out.println("더이상 도서를 추가 할 수 없습니다.");
    }

    public void displayBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public void searchBookByTitle(String title) {
        System.out.println("=== '" + title + "' 검색 결과 ===");
        boolean find = false;

        for (Book book : books) {
            if (book != null && book.hasSameTitle(title)) {
                System.out.println(book);
                find = true;
            }
        }
        if (find == false) {
            System.out.println("해당 도서가 없습니다.");
        }
    }

}
