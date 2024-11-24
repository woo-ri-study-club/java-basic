package mission3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        EBook eBook1 = new EBook("자바의 정석", "남궁성", "PDF");
        EBook eBook2 = new EBook("열혈강의 자바", "구정은", "EPUB");
        PrintedBook printedBook1 = new PrintedBook("이것이 자바다", "신용권", "한빛미디어");
        PrintedBook printedBook2 = new PrintedBook("이것이 C언어다", "신용권", "한빛미디어");

        library.addBook(eBook1);
        library.addBook(eBook2);
        library.addBook(printedBook1);
        library.addBook(printedBook2);

        library.printBooks();
    }
}
