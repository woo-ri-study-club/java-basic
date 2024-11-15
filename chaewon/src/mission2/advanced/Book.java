package mission2.advanced;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public boolean isTitleSame(String title){
        return title.equalsIgnoreCase(this.title);
    }

    public String readOneBook(){
        return String.format("도서명: %s | 작가: %s | ISBN: %s", this.title, this.author, this.author);
    }
}
