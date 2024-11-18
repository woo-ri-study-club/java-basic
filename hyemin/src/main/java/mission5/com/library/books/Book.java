package mission5.com.library.books;

public class Book {
    private String name;
    private String author;
    private String isbn;

    public Book(String name, String author, String isBn) {
        validateInput(name, "제목");
        validateInput(author, "저자");
        validateInput(isBn, "ISBN");

        this.name = name;
        this.author = author;
        this.isbn = isBn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    private void validateInput(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + "은 null이거나 비어 있을 수 없습니다.");
        }
    }
}
