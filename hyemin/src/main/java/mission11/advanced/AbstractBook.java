package mission11.advanced;

public abstract class AbstractBook implements Book{

    private String title;
    private String author;

    public AbstractBook(String title, String author) {
        this.title = title;
        this.author = author;
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
        return "제목: " + title + ", 작가: " + author;
    }
}
