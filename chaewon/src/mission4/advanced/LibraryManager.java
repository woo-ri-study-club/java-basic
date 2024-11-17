package mission4.advanced;

import java.util.List;

public class LibraryManager {
    public static void main(String[] args) {
        try {
            Library library = new Library(5);

            System.out.println("=======도서 추가 기능=======");

            Book book1 = new Book("소년이 온다.", "한강", 2010);
            library.addBook(book1);

            Book book2 = new Book("채식주의자", "한강");
            library.addBook(book2);

            Book book3 = new Book("최강록의 요리 노트", "최강록", 2015);
            library.addBook(book3);

            Book book4 = new Book("넥서스", "유발 하라리");
            library.addBook(book4);

            Book book5 = new Book("어른의 행복은 조용하다", "태수");
            library.addBook(book5);

            Book exceedBook = new Book("초과 도서", "초과");
            library.addBook(exceedBook);

            System.out.println("=======도서 검색 기능=======");
            List<Book> foundBook = library.searchBook("넥서스");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
