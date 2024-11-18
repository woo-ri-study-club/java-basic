public class Book {
    private final String title;
    private final String author;
    private final String publishedYear;

    public Book(String title, String author, String publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public Book(String title, String author) {
        this(title, author, "2024");
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public String getTitle() {
        return title;
    }
}
