package section06.library;

import section06.library.books.Book;
import section06.library.users.User;

public class LibraryTest {

  public static void main(String[] args) {
    // Book 객체 생성
    Book book1 = new Book("이펙티브자바", "조슈아블로크", "1111");
    Book book2 = new Book("객체지향의사실과오해", "조영호", "2222");
    Book book3 = new Book("토비의스프링", "토비", "3333");

    // User 객체 생성
    User noah = new User("noah");
    User joey = new User("joey");

    // noah 책 대출
    System.out.println("### noah 도서(이펙티브자바, 객체지향의사실과오해) 대출 ###");
    noah.borrowBook(book1);
    noah.borrowBook(book2);
    System.out.println();

    // joey 책 대출
    System.out.println("### joey 도서(객체지향의사실과오해) 대출 ###");
    joey.borrowBook(book2); // 이미 대출 중인 책은 대출할 수 없음을 확인
    System.out.println();

    // noah 책 반납
    System.out.println("### noah 도서(이펙티브자바, 토비의스프링) 반납 ###");
    noah.returnBook(book1);
    noah.returnBook(book3); // 대출하지 않는 책을 반납하려고 시도
    System.out.println();


    // 도서 대출 목록 확인
    System.out.println("### noah가 대출한 책 조회 ###");
    noah.printBorrowedBooks();
    System.out.println();

    System.out.println("### joey가 대출한 책 조회 ###");
    joey.printBorrowedBooks();
    System.out.println();
  }
}
