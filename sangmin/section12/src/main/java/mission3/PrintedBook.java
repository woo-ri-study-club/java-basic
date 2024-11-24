package mission3;

public class PrintedBook implements Book {
    private String title;
    private String author;
    private String publisher;

    public PrintedBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
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
        return "PrintedBook{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
