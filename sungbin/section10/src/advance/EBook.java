package advance;

public class EBook extends Book {

    private int fileSize;

    private String format;

    public EBook(String title, String author, int price, int fileSize, String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + "MB, Format: " + format);
    }
}
