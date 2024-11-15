package section04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManager2 {

  private static List<Book> books = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println("도서를 등록합니다.(헤드퍼스트디자인패턴, 객체지향의사실과오해, 오브젝트, 이펙티브자바, 도메인주도개발시작하기)");
    addBook("헤드퍼스트디자인패턴", "에릭프리먼", "1111");
    addBook("객체지향의사실과오해", "조영호", "2222");
    addBook("오브젝트", "조영호", "3333");
    addBook("이펙티브자바", "조슈아블로크", "4444");
    addBook("도메인주도개발시작하기", "최범균", "5555");
    System.out.println();

    System.out.println("등록된 모든 도서를 출력합니다.");
    printBooks();
    System.out.println();

    System.out.println("도서('객체지향의사실과오해')를 검색합니다.");
    Book book = searchByTitle("객체지향의사실과오해");
    System.out.println("검색한 도서: " + book);
    System.out.println();

    System.out.println("도서번호('2222')인 도서를 삭제합니다.");
    deleteByIsBn("1111");
    System.out.println();

    System.out.println("도서번호('2222')를 검색합니다.");
    Book book2 = searchByIsBn("2222");
    System.out.println("검색한 도서: " + book2);
    System.out.println();
  }

  // 도서 추가
  static void addBook(String title, String author, String isBn) {
    Book newBook = new Book(title, author, isBn);
    if (books.contains(newBook)) {
      System.out.println("이미 등록된 도서입니다.");
      return;
    }
    books.add(newBook);
  }

  // 모든 도서 조회
  static void printBooks() {
    System.out.println("### 모든 도서 출력 ###");
    for (Book book : books) {
      System.out.println(book);
    }
  }

  // 제목으로 도서 검색
  static Book searchByTitle(String title) {
    for (Book book : books) {
      if (book.isTitle(title)) {
        return book;
      }
    }
    System.out.println("검색한 도서가 존재하지 않습니다.");
    return null;
  }

  // 도서번호로 도서 검색
  static Book searchByIsBn(String isBn) {
    for (Book book : books) {
      if (book.isIsBn(isBn)) {
        return book;
      }
    }
    System.out.println("검색한 도서가 존재하지 않습니다.");
    return null;
  }


  // 도서 삭제
  static void deleteByIsBn(String isBn) {
    Iterator<Book> iterator = books.iterator();
    while (iterator.hasNext()) {
      Book book = iterator.next();
      if (book.isIsBn(isBn)) {
        iterator.remove();
      }
    }
    // NOTE: removeIf를 사용할 수 있음
    // books.removeIf(book -> book.getIsBn().equals(isBn));
  }
}
