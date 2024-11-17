/*
초급
첫 번째 단계에서는 단일 클래스 LibraryManager에 모든 기능이 포함된 절차지향 방식으로 시스템을 구축합니다.

LibraryManager 클래스를 생성하고 main 메서드에서 전체 도서 관리 작업을 수행합니다.
LibraryManager 내부에 List<String> books를 선언하여 도서 이름을 저장합니다.
메서드를 작성합니다
도서 추가: 도서 이름을 입력받아 리스트에 추가
모든 도서 조회: 리스트에 있는 모든 도서를 출력
도서 검색: 도서 이름으로 검색하고 해당 도서의 유무를 반환
모든 코드가 LibraryManager 클래스 내에 위치하며, 절차지향 방식으로 단순히 작업을 나열하는 형태입니다.
 */
package section4.mission1;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

    static List<String> books = new ArrayList<>();

    public static void main(String[] args) {

        addBook("책1");
        addBook("책2");
        addBook("책3");

        printBooks();

        String findBookTitle = "책2";
        System.out.println(hasBook(findBookTitle) ? "도서가 있습니다." : "도서가 없습니다.");
    }

    public static void addBook(String title) {
        books.add(title);
    }

    public static void printBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static boolean hasBook(String title) {
        return books.contains(title);
    }
}
