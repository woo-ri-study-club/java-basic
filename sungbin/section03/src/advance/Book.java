package advance;

public class Book {

    private String title;

    private String author;

    private boolean isRegistered;

    public Book() {
        this.isRegistered = false;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isRegistered = true;
    }

    public String getTitle() {
        return  isRegistered ? title : "이 책은 아직 등록되지 않았습니다.";
    }
}
