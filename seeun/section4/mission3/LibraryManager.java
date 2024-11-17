/*
고급
마지막 단계에서는 더 추상화하고 캡슐화를 통해 완전한 객체지향 시스템으로 발전시킵니다.

Library 클래스 생성
이 클래스는 도서 리스트를 관리하며, 도서 추가, 삭제, 검색을 담당합니다.
LibraryManager는 이제 직접 리스트를 다루지 않고 Library 클래스와만 상호작용합니다.
LibraryManager 리팩토링
LibraryManager는 이제 사용자 입력과 상호작용만을 처리하고, 도서 관련 기능은 모두 Library 클래스에 위임합니다.
추가 기능
도서 대출 시스템 구현: 사용자가 도서를 대출하고 반납할 수 있도록 Book 클래스에 isCheckedOut 필드를 추가합니다.
대출 가능한 도서만 조회하는 기능 추가.
예외 처리: 존재하지 않는 도서를 대출하려 할 때나 이미 대출된 도서를 대출하려 할 때 등의 상황을 처리합니다.
 */
package section4.mission3;

import java.util.Scanner;

public class LibraryManager {

    static Scanner scanner = new Scanner(System.in);
    static Library library;

    public static void main(String[] args) {

        startLibraryManageSystem();

    }

    private static void startLibraryManageSystem() {

        library = Library.emptyLibrary();

        library.addBook(Book.createBook("책1", "책1저자", "001"));
        library.addBook(Book.createBook("책2", "책2저자", "002"));
        library.addBook(Book.createBook("책3", "책3저자", "003"));

        System.out.println("**도서 대출 시스템**");
        boolean stop = false;

        while(!stop){
            System.out.println("대출(1), 반납(2), 대출 가능 도서조회(3), 종료(4)");
            switch (scanner.nextInt()) {
                case 1:
                    checkoutBook();
                    break;

                case 2:
                    returnBook();
                    break;

                case 3:
                    showAvailableBooks();
                    break;

                case 4:
                    stop = true;
                    break;

                default:
                    throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }

    }

    private static void showAvailableBooks() {
        System.out.println("대출 가능 도서조회");
        library.showAvailableBook();
    }

    private static void returnBook() {
        System.out.println("도서 반납");
        System.out.print("반납 도서 이름 입력: ");
        String title = scanner.next();
        System.out.print("반납 도서 저서 입력: ");
        String author = scanner.next();
        System.out.print("반납 도서 isBn 입력: ");
        String isBn = scanner.next();
        library.returnBook(title, author, isBn);
    }

    private static void checkoutBook() {
        System.out.println("도서 대출");
        System.out.print("대출 도서 입력(이름 or 저자 or isBn): ");
        String userInput = scanner.next();
        library.checkOutBook(userInput);
    }


}
