package mission11;

public class EBook extends AbstractBook {

    private String format;

    public EBook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", 파일 형식: " + format;
    }
}
