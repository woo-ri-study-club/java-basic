package mission4.middle;

import java.time.Year;

public class MiddleMain {
    public static void main(String[] args) {
        Book book1 = new Book("새책", "홍길동");
        Book book2 = new Book("새 책입니다.", "누군가", 2010);

        System.out.println(book1);
        System.out.println(book2);
    }
}
