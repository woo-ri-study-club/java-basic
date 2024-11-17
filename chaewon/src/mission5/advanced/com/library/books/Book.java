package mission5.advanced.com.library.books;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;

    public Book(String title, String author, String isbn) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("도서명을 입력하세요.");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("작가명을 입력하세요.");
        }
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN을 입력하세요.");
        }

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void borrowBook() {
        if (!isAvailable) {
            throw new IllegalArgumentException("대여가 불가능한 도서입니다.");
        }

        this.isAvailable = false;
    }

    public void returnBook() {
        if (isAvailable) {
            throw new IllegalArgumentException("반납이 불가능한 도서입니다.");
        }

        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "도서 정보{" +
                "제목:'" + title + '\'' +
                ", 작가:'" + author + '\'' +
                ", ISBN:'" + isbn + '\'' +
                '}';
    }
}
