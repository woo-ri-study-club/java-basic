package mission3;

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
        return "EBook{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
