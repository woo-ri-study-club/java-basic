package mission11;

public class PrintedBook extends AbstractBook{

    private String publisher;

    public PrintedBook(String title, String author, String publisher) {
        super(title, author);
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return super.toString() + ", 출판사: " + publisher;
    }
}
