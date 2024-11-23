package section12.advenced;

public class LibraryMain {

  public static void main(String[] args) {
    Library library = new Library();

    library.addBook(new EBook("자바의정석", "남궁성", "PDF"));
    library.addBook(new PrintedBook("이펙티브자바", "조슈아블로크", "인사이트"));

    // 도서 출력
    library.viewAllBooks();
  }
}
