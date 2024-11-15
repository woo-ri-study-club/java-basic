package section04;

public class LibraryManager3 {

  public static void main(String[] args) {
    Library library = new Library();
    System.out.println("도서를 등록합니다.(헤드퍼스트디자인패턴, 객체지향의사실과오해, 오브젝트, 이펙티브자바, 도메인주도개발시작하기)");
    library.addBook("헤드퍼스트디자인패턴", "에릭프리먼", "1111");
    library.addBook("객체지향의사실과오해", "조영호", "2222");
    library.addBook("오브젝트", "조영호", "3333");
    library.addBook("이펙티브자바", "조슈아블로크", "4444");
    library.addBook("도메인주도개발시작하기", "최범균", "5555");
    System.out.println();

    System.out.println("등록된 모든 도서를 출력합니다.");
    library.printAllBooks();
    System.out.println();

    System.out.println("도서('객체지향의사실과오해')를 검색합니다.");
    library.searchByTitle("객체지향의사실과오해")
           .ifPresentOrElse(book -> System.out.println("검색한 도서: " + book),
                            () -> System.out.println("검색한 도서는 존재하지 않습니다.")
           );
    System.out.println();

    System.out.println("도서번호('5555')인 도서를 삭제합니다.");
    library.deleteByIsBn("5555");
    System.out.println();

    System.out.println("도서번호('5555')를 대출합니다.");
    library.checkOutBook("5555");
    System.out.println();

    System.out.println("도서번호('6666')인 도서를 삭제합니다.");
    library.deleteByIsBn("6666");
    System.out.println();

    System.out.println("도서 삭제 후 전체 도서 목록:");
    library.printAllBooks();
    System.out.println();

    System.out.println("도서번호('2222')를 대출합니다.");
    library.checkOutBook("2222");
    System.out.println();

    System.out.println("도서번호('2222')를 대출합니다.");
    library.checkOutBook("2222");
    System.out.println();

    System.out.println("도서번호('2222')인 도서를 삭제합니다.");
    library.deleteByIsBn("2222");
    System.out.println();

    System.out.println("대출 가능한 도서 목록을 출력합니다.");
    library.printAvailableBooks();
    System.out.println();

    System.out.println("도서번호('2222')를 반납합니다.");
    library.returnBook("2222");
    System.out.println();

    System.out.println("도서번호('2222')를 반납합니다.");
    library.returnBook("2222");
    System.out.println();

    System.out.println("대출 가능한 도서 목록을 출력합니다.");
    library.printAvailableBooks();
    System.out.println();
  }
}
