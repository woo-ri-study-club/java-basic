package section5.mission3;

import java.time.Year;

public class Book {

    private String title;
    private String author;
    private Year publishYear;

    public Book(String title, String author, Year publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public boolean isTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", publishYear: " + publishYear;
    }
}
