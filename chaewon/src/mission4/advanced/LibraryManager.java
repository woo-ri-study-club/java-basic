package mission4.advanced;

public class LibraryManager {
    public static void main(String[] args) {
        try {
            Library library = new Library(5);

            System.out.println("=======도서 추가 기능=======");

            Book book1 = new Book("소년이 온다.", "한강", 2010);
            Book addBook1 = library.addBook(book1);
            System.out.println(addBook1);

            Book book2 = new Book("채식주의자", "한강");
            Book addBook2 = library.addBook(book2);
            System.out.println(addBook2);

            Book book3 = new Book("최강록의 요리 노트", "최강록", 2015);
            Book addBook3 = library.addBook(book3);
            System.out.println(addBook3);

            Book book4 = new Book("넥서스", "유발 하라리");
            Book addBook4 = library.addBook(book4);
            System.out.println(addBook4);

            Book book5 = new Book("어른의 행복은 조용하다", "태수");
            Book addBook5 = library.addBook(book5);
            System.out.println(addBook5);

            Book book6 = new Book("초과 도서", "초과");
            Book addBook6 = library.addBook(book6);
            System.out.println(addBook6);

            System.out.println("=======도서 검색 기능=======");
            Book foundBook = library.searchBook("넥서스");
            System.out.println(foundBook);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
