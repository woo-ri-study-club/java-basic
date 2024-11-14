package mission02;

public class Library {
    public static void main(String[] args) {

        Book[] books = {
                new Book("JAVA1", "김땡땡", 10000),
                new Book("JAVA2", "김땡땡", 10000),
                new Book("SPRING1", "김땡땡", 40000),
                null,
                new Book("SPRING2", "김땡땡", 40000),
                new Book("JPA1", "김땡땡", 20000),
                new Book("JPA2", "김땡땡", 20000),
        };

        books = addBook(books, "자료구조1", "박땡땡", 20000);
        books = addBook(books, "자료구조2", "박땡땡", 20000);

        showBooksDetail(books);
        serchBook(books, "JPA2");
    }

    static void showBooksDetail(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static Book[] addBook(Book[] books, String title, String author, int price) {
        Book[] updatedBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, updatedBooks, 0, updatedBooks.length - 1);

        Book book = new Book(title, author, price);
        updatedBooks[books.length] = book;
        return updatedBooks;
    }

    static void serchBook(Book[] books, String title) {
        System.out.println("제목 " + title + "을 검색한 결과 =======");
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }
    }
}
