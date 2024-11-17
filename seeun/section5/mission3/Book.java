package section5.mission3;

public class Book {

    private String title;
    private String author;
    private int publishYear;

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public boolean isTitle(String title) {
        return this.title.equals(title);
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", publishYear: " + publishYear;
    }
}
