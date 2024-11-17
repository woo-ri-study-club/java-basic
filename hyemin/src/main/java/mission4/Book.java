package mission4;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int publishedYear;

    Book(String name, String author) {
        this(name, author, LocalDate.now().getYear());
    }
    Book(String name, String author, int publishedYear) {
        validateInput(name, "제목");
        validateInput(author, "저자");

        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    private void validateInput(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new LibraryException(ErrorCode.REQUIRE_NOT_NULL_NOT_EMPTY, fieldName + "은 Null이거나 비어있을 수 없습니다.");
        }
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                publishedYear == book.publishedYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishedYear);
    }
}
