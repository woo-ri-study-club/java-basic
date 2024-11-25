package mission12.domain;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        validateBook(title, author, isbn);

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    private static void validateBook(String title, String author, String isbn) {
        validateField(title, "도서 제목은 null이거나 공백일 수 없습니다.");
        validateField(author, "도서 작가명은 null이거나 공백일 수 없습니다.");
        validateField(isbn, "도서 ISBN은 null이거나 공백일 수 없습니다.");
    }

    private static void validateField(String field, String errorMessage) {
        if (field == null || field.isBlank()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
