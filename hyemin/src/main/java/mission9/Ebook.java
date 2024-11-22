package mission9;

public class Ebook extends Book {
    private String fileSize;
    private String format;

    public Ebook(String title, String author, int price, String fileSize, String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", FileSize: " + fileSize + ", Format: " + format;
    }
}
