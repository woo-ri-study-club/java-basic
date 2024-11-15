package mission03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>(
            Arrays.asList(
                    new Book("JAVA1", "kim", "1", true),
                    new Book("JAVA1", "kim", "2", false),
                    new Book("SPRING1", "kim", "3", true)
            )
    );

    public void addBook(String title, String author, String isBn) {
        books.add(new Book(title, author, isBn));
        System.out.println("목록에 추가된 책: "+title);
    }

    public void displayAllBooks() {
        System.out.println("=== 전체 도서 목록 ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBookByTitle(String title) {
        System.out.println("=== 검색 결과 ===");
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("제목이 " + title + "인 책이 있습니다.");
                return;
            }
        }
        System.out.println("제목이 " + title + "인 책이 없습니다.");
    }

    public void deleteBookByIsBn(String isBn) {
        for (Book book : books) {
            if (book.toString().equals(isBn)) {
                books.remove(book);
                System.out.println("책을 삭제합니다.");
                return;
            }
        }
        System.out.println("삭제할 수 있는 책이 없습니다.");
    }

    public void displayAvailableBooks() {
        System.out.println("=== 대출 가능한 도서 목록 ===");
        for (Book book : books) {
            if (book.isCheckedOut()) continue;
            System.out.println(book);
        }
    }

    public void borrowBookByTitle(String title){
        for(Book book:books){
            if(book.getTitle().equals(title)){
                if(book.isCheckedOut()){
                    System.out.println("도서가 현재 대출중입니다.");
                }else{
                    System.out.println(title+"가 대출되었습니다.");
                }
                return;
            }
        }
        System.out.println("제목이 " + title + "인 책이 없습니다.");
    }

}
