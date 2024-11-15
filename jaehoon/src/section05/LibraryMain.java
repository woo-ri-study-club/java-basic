package section05;

public class LibraryMain {

  public static void main(String[] args) {
    try {
      Library library = new Library();
      library.addBook("이펙티브자바", "조슈아블로크", 2001);
      library.addBook("객체지향의사실과오해", "조영호", 2015);

      System.out.println("### 도서제목(이펙티브자바) 검색 ###");
      library.searchByTitle("이펙티브자바")
             .ifPresentOrElse(System.out::println,
                              () -> System.out.println("해당 도서를 찾을 수 없습니다."));
      System.out.println();

      System.out.println("### 전체 도서 목록 출력 ###");
      library.printAllBook();
    } catch (RuntimeException runtimeException) {
      System.out.println(runtimeException.getMessage());
    }
  }
}
