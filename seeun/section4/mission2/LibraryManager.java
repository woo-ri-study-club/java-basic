/*
중급
이 단계에서는 데이터와 메서드를 개별 클래스로 분리하여 점진적으로 객체지향으로 전환합니다.

Book 클래스를 생성하여 각 도서를 표현합니다.
필드: String title, String author, String isBn
각 필드를 가져오는 메서드와 도서 객체를 비교하는 equals() 메서드를 추가합니다.
LibraryManager를 업데이트합니다.
List<String> books를 List<Book> books로 변경합니다.
각 메서드를 Book 객체를 활용하도록 수정합니다.
추가 기능
IsBn으로 도서 삭제: isBn을 기반으로 특정 도서를 찾아 삭제합니다.
데이터와 로직이 Book 클래스로 분리되면서 코드가 더 깔끔해지고 명확해집니다.
 */
package section4.mission2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LibraryManager {

    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        addBook(Book.createBook("책1", "책1저자", "001"));
        addBook(Book.createBook("책2", "책2저자", "002"));
        addBook(Book.createBook("책3", "책3저자", "003"));

        printBooks();

        Book findBook = Book.createBook("책2", "책2저자", "002");
        System.out.println(hasBook(findBook) ? "도서가 있습니다." : "도서가 없습니다.");

        removeBookByIsBn("003");
        printBooks();
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static boolean hasBook(Book findbook) {
        for (Book book : books) {
            if (book.equals(findbook)) {
                return true;
            }
        }
        return false;
    }

    public static void removeBookByIsBn(String isBn) {
        for (Book book : books) {
            if (book.equalsByIsBn(isBn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoSuchElementException("해당 isBn의 도서가 존재하지 않습니다.");
    }
}
