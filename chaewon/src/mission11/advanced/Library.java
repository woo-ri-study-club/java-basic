package mission11.advanced;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        if(isNull(book)){
            throw new IllegalArgumentException("추가할 도서가 null 입니다.");
        }

        books.add(book);
    }

    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("도서 리스트가 비어있습니다.");
        }

        books.forEach(System.out::println);
    }
}
