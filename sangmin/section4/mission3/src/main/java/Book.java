import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final String isBn;

    public Book(String title, String author, String isBn) {
        this.title = title;
        this.author = author;
        this.isBn = isBn;
    }

    public boolean isMatchedTitle(String title) {
        return this.title.equals(title);
    }

    public boolean isMatchedIsbn(String isbn) {
        return this.isBn.equals(isbn);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(isBn, book.isBn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isBn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isBn='" + isBn + '\'' +
                '}';
    }
}
