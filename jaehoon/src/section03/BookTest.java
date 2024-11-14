package section03;

/**
 * 참조형의 `null` 값과 `NullPointerException` 문제를 다루는 미니 프로젝트를 만들어 보세요.<p>
 * - 여러 `Book` 객체를 포함하는 간단한 `Library` 클래스를 설계하세요.<p>
 * - 책을 추가하고, 제목으로 책을 검색하고, 책의 세부 정보를 표시하는 메서드를 구현하세요.<p>
 * - `Book` 객체 중 하나를 `null`로 남겨두고, 메서드를 통해 접근해 보세요.<p>
 * - 참조형을 다룰 때 `NullPointerException`이 발생하는 이유를 설명하고, 이를 방지하는 방법을 제안해 보세요.<p>
 */
public class BookTest {

  public static void main(String[] args) {
    Library library = new Library();
    library.addBook(new Book("헤드퍼스트디자인패턴", 19000));
    library.addBook(new Book("객체지향의사실과오해", 21000));
    library.addBook(new Book("오브젝트", 30000));
    library.addBook(new Book("이펙티브자바", 24000));
    // 의도적으로 null로 book을 등록
    library.addBook(null);
    System.out.println("### 헤드퍼스트디자인패턴, 객체지향의사실과오해, 오브젝트, 이펙티브자바, 자바의정석 책 등록 ###");
    System.out.println();

    Book book1 = library.searchByTitle("오브젝트");
    System.out.println("### 책 타이틀 검색: 오브젝트 ###");
    System.out.println("제목 = " + book1.getTitle());
    System.out.println("가격 = " + book1.getPrice());
    System.out.println();

    System.out.println("### 라이브러리에 있는 모든 책 정보조회 ###");
    library.printBooks();
  }
}
