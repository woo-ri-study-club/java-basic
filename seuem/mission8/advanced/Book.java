package seuem.mission8.advanced;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void showInfo() {
        System.out.println(title+" by "+author);
    }
}
