package mission4;

public class BookAdvancedMain {
    public static void main(String[] args) {
        Book book1 = new Book("해리포터와 마법사의 돌", "JK 롤링");
        System.out.println(book1);

        Book book2 = new Book("해리포터와 비밀의 방", "JK 롤링", 1998);
        System.out.println(book2);

        Library library = new Library(2);

        try {
            library.addBook(book1);
            //System.out.println(library.getBookByName("해리포터와 비밀의 방"));
            library.addBook(book1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
