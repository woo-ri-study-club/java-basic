package mission2;

public class BookMain {
    public static void main(String[] args) {
        Book[] books = {
                new Book("자바", "홍길동"),
                new Book("파이썬", "고길동"),
                null
        };

        Library library = new Library(5);
        for (Book book : books) {
            library.addBook(book);
        }

        try {
            library.printBookDetails(books[0].getTitle());
            library.printBookDetails("없는 책"); // 예외 발생
            library.printBookDetails(books[2].getTitle());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
