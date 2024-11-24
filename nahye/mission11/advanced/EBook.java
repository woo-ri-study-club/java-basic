package mission11.advanced;

public class EBook implements Book {

    private String title;
    private String author;
    private String format;

    public EBook(String title, String author, String format) {
        this.title = title;
        this.author = author;
        this.format = format;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "<EBook> 제목: " + title + ", 저자: " + author + ", 제공 파일형식: " + format;
    }
}
