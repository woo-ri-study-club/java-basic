package mission8.advanced;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final int MAX_BOOKS = 10;
    private final List<Book> books = new ArrayList<>();

    public boolean addBook(Book book){
        if (checkBooksVolume()){
            System.out.println("도서를 채울 수 있는 용량이 존재하지 않습니다. 저장을 실패한 도서: [" + book + "]");
            return false;
        }

        books.add(book);
        return true;
    }

    public void showBooks(){
        books.forEach(System.out::println);
    }

    private boolean checkBooksVolume() {
        return books.size() >= MAX_BOOKS;
    }
}
