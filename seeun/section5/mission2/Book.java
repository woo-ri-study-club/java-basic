package section5.mission2;

public class Book {
    private String title;
    private String author;
    private int publishYear;

    public Book(String title, String author) {
        this(title, author, 2024);
    }

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public void displayBook() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 출판 연도: " + publishYear);
    }
}
