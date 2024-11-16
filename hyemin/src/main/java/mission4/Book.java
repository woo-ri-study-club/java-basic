package mission4;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private int publishedYear;

    Book(String name, String author) {
        this(name, author, LocalDate.now().getYear());
    }
    Book(String name, String author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName(){
        return name;
    }

    public boolean matchName(String name) {
        return this.name.equals(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
