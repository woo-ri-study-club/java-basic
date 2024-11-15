package section04;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager1 {

  private static List<String> books = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println("도서 이름을 등록합니다.(헤드퍼스트디자인패턴, 객체지향의사실과오해, 오브젝트, 이펙티브자바, 자바의정석)");
    addBook("헤드퍼스트디자인패턴");
    addBook("객체지향의사실과오해");
    addBook("오브젝트");
    addBook("이펙티브자바");
    addBook("도메인주도개발시작하기");

    System.out.println("등록된 모든 도서를 출력합니다.");
    printBooks();
    System.out.println();

    System.out.println("도서('오브젝트')를 검색합니다.");
    String findBook = searchByTitle("오브젝트");
    System.out.println("검색한 도서명: " + findBook);
    System.out.println();

    System.out.println("도서('자바의정석')를 검색합니다.");
    String findBook2 = searchByTitle("자바의정석");
    System.out.println("검색한 도서명: " + findBook2);
  }

  // 도서 추가
  static void addBook(String title) {
    if (books.contains(title)) {
      System.out.println("이미 등록된 도서입니다.");
      return;
    }
    books.add(title);
  }

  // 모든 도서 조회
  static void printBooks() {
    System.out.println("### 모든 도서 출력 ###");
    for (String bookTitle : books) {
      System.out.println("도서명: " + bookTitle);
    }
  }

  // 도서 검색
  static String searchByTitle(String title) {
    for (String bookTitle : books) {
      if (bookTitle.equalsIgnoreCase(title)) {
        return bookTitle;
      }
    }
    System.out.println("검색한 도서가 존재하지 않습니다.");
    return null;
  }
}
