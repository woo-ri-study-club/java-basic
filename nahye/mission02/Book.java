package mission02;

public class Book {

    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "제목: "+title+" 저자: "+author+"가격: "+price;
    }
}
