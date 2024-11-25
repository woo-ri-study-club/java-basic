package mission12;

public class Book {
    private String title;
    private String author;

    private String isbn;

    private boolean isBorrowed;
    private String borrowedId;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        this.borrowedId = "";
    }

    public boolean hasSameTitle(String title) {
        return this.title.equals(title);
    }

    public void borrow(){
        this.isBorrowed = true;
    }

    public boolean isNotBorrowed(){
        return !isBorrowed;
    }

    public boolean isBorrowed(){
        return this.isBorrowed;
    }

    public void enrollBorrowedId(String id) {
        this.borrowedId = id;
    }
    
    

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " +author+", ISBN: "+isbn;
    }

    public void isReturn() {
        this.isBorrowed = false;
        this.borrowedId = "";
    }

    public boolean isBorrowedBy(String id) {
        return this.borrowedId.equals(id);
    }

}
