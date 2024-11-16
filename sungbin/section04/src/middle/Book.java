package middle;

public class Book {

    private String title;

    private String author;

    private String isbn;

    private boolean isCheckedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkout() {
        if (isCheckedOut) {
            throw new IllegalStateException("현재 도서가 대출되었습니다.");
        }

        isCheckedOut = true;
    }

    public void returnBook() {
        if (!isCheckedOut) {
            throw new IllegalStateException("현재 도서가 대출되지 않았습니다.");
        }

        isCheckedOut = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 작가: " + author + "일련번호: " + isbn;
    }
}
