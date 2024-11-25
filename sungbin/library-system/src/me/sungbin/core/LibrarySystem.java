package me.sungbin.core;

import me.sungbin.book.BookManager;
import me.sungbin.user.UserManager;

import java.util.Scanner;

public class LibrarySystem {

    private final Scanner scanner = new Scanner(System.in);
    private final UserManager userManager = new UserManager();
    private final BookManager bookManager = new BookManager();

    public void start() {

    }

    private void showLoginMenu() {
        System.out.println("=== 도서 관리 시스템 ===");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.println("선택: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> userManager.registerUserThrough(scanner);
            default -> System.out.println("잘못된 입력 값 입니다.");
        }
    }

    private void showMemberMenu() {
        System.out.println("=== 회원 메뉴 ===");
        System.out.println("1. 책 조회");
        System.out.println("2. 책 대출");
        System.out.println("3. 책 반납");
        System.out.println("4. 대출 목록 조회");
        System.out.println("5. 로그아웃");
        System.out.println("선택: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
    }

    private void showAdminMenu() {
        System.out.println("=== 관리자 메뉴 ===");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 조회");
        System.out.println("3. 대출 회원 목록 조회");
        System.out.println("4. 로그아웃");
        System.out.println("선택: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
    }
}
