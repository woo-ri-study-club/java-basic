/*
고급
Library 클래스를 작성하여 다양한 도서를 관리하는 시스템을 구현하세요.
Library 클래스는 Book 객체 배열을 필드로 가지며, Library 객체를 생성할 때 배열의 크기를 지정하는 생성자와 배열 크기를 기본값으로 설정하는 기본 생성자를 포함하세요.
각 Book 객체는 제목과 저자, 출판 연도를 필드로 가지며 생성자를 통해 이들 필드를 초기화합니다.
Library 클래스에 새 도서를 추가하고, 특정 제목의 도서를 검색하는 메서드를 추가하세요.
 */
package section5.mission3;

import java.time.Year;

public class LibraryManager {

    public static void main(String[] args) {

        Library library1 = new Library();
        library1.addBook(new Book("책1", "책1저자", Year.of(2015)));
        library1.addBook(new Book("책2", "책2저자", Year.of(2016)));

        library1.showLibrary();
        System.out.println();

        Library library2 = new Library(3);
        library2.addBook(new Book("책3", "책3저자", Year.of(2000)));
        library2.addBook(new Book("책4", "책4저자", Year.of(2001)));
        library2.addBook(new Book("책5", "책5저자", Year.of(2002)));
        library2.addBook(new Book("책6", "책6저자", Year.of(2003)));

        library2.showLibrary();

        library2.findByTitle("책5");
        library2.findByTitle("책7");
    }
}
