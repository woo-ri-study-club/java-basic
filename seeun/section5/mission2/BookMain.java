/*
중급
Book 클래스는 책의 제목과 저자, 출판 연도를 나타내는 필드를 포함합니다. 생성자 오버로딩을 사용하여, 제목과 저자만 받는 생성자와, 제목, 저자, 출판 연도를 받는 생성자를 작성하세요.
이때, 첫 번째 생성자는 출판 연도를 현재 연도로 초기화하는 다른 생성자를 호출하도록 하세요.
 */
package section5.mission2;

import java.sql.SQLOutput;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("책1", "책1저자");
        System.out.println(book1);

        Book book2 = new Book("책2", "책2저자", 2000);
        System.out.println(book2);
    }
}
