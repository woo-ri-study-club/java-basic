package mission9.advanced;

public class EBook extends Book {
    private long fileSize;
    private String format;

    public EBook(String title, String author, int price, long fileSize, String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", " +
                "File Size: " + fileSize + ", Format: " + format);
    }
}
