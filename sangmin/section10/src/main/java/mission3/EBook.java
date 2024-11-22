package mission3;

public class EBook extends Book {
    private String fileSize;
    private String format;

    public EBook(final String title, final String author, final int price, final String fileSize, final String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + super.getTitle() + ", Author: " + super.getAuthor() + ", Price: " + super.getPrice() + ", File Size: " + fileSize + ", Format: " + format);
    }
}
