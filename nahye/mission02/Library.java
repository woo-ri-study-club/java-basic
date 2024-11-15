package mission02;

public class Library {
    private Book[] books = {
            new Book("JAVA1", "김땡땡", 10000),
            new Book("JAVA2", "김땡땡", 10000),
            new Book("SPRING1", "김땡땡", 40000),
            null,
            new Book("SPRING2", "김땡땡", 40000),
            new Book("JPA1", "김땡땡", 20000),
            new Book("JPA2", "김땡땡", 20000),
    };

    public void showBooksDetail() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(String title, String author, int price) {
        Book[] updatedBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, updatedBooks, 0, updatedBooks.length - 1);

        Book book = new Book(title, author, price);
        updatedBooks[books.length] = book;
        this.books = updatedBooks;
    }

    public void searchBook(String title) {
        System.out.println("제목 " + title + "을 검색한 결과 =======");
        for (Book book : books) {
            if (book != null && book.hasTitle(title)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("자료구조1", "박땡땡", 20000);
        library.addBook("자료구조2", "박땡땡", 20000);

        library.showBooksDetail();
        library.searchBook("JPA2");
    }
}
