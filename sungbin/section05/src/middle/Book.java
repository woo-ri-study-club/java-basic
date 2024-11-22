package middle;

import java.time.Year;

public class Book {

    private String title;

    private String author;

    private int publicationYear;

    public Book(String title, String author) {
        this(title, author, Year.now().getValue());
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
