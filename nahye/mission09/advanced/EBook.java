package mission09.advanced;

public class EBook extends Book {
    private String fileSize;
    private String format;

    public EBook(String title, String author, int price, String fileSize, String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(",File Size: " + fileSize + ", Format: " + format);
    }


}
