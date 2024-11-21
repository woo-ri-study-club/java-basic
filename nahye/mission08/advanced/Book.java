package mission08.advanced;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "책 이름: " + title + ", 저자: " + author;
    }
}
