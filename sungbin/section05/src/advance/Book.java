package advance;

import java.time.Year;
import java.util.Objects;

public class Book {

    private String title;

    private String author;

    private Year publicationYear;

    public Book(String title, String author, Year publicationYear) {
        validateTitle(title);
        validateAuthor(author);
        validatePublicationYear(publicationYear);

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Book(String title, String author, int publicationYear) {
        this(title, author, Year.of(publicationYear));
    }

    public boolean is(String title) {
        return Objects.equals(this.title, title);
    }

    private void validateTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("제목은 null이거나 빈 값일 수 없습니다.");
        }
    }

    private void validateAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("저자는 null이거나 빈 값일 수 없습니다.");
        }
    }

    private void validatePublicationYear(Year publicationYear) {
        if (publicationYear == null || publicationYear.isAfter(Year.now())) {
            throw new IllegalArgumentException("출판 연도는 null이거나 현재 연도 이후일 수 없습니다.");
        }
    }
}
