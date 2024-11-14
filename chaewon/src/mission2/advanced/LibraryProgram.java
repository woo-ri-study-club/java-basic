package mission2.advanced;

public class LibraryProgram {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(
                new Book("채식주의자", "한강", "9788936492373")
        );
        library.addBook(
                new Book("소년이 온다", "한강", "9788936403720")
        );
        library.addBook(
                new Book("최강록의 요리노트", "최강록", "9791192512419")
        );

        Book findBook = library.findBookByTitle("최강록의 요리노트");
        System.out.println(findBook.readOneBook());

    }
}
