package me.sungbin.core;

import me.sungbin.book.BookManager;
import me.sungbin.user.UserManager;
import me.sungbin.util.FileManager;

import java.util.Scanner;

public class LibrarySystem {

    private final Scanner scanner = new Scanner(System.in);
    private final UserManager userManager = new UserManager();
    private final BookManager bookManager = new BookManager();
    private final SessionManager sessionManager = new SessionManager();
    private final FileManager fileManager = new FileManager();

    public void start() {
        fileManager.loadData(userManager, bookManager);

        while (true) {
            if (sessionManager.isNotLogin()) {
                showLoginMenu();
            } else {
                if (sessionManager.isAdmin()) {
                    showAdminMenu();
                } else {
                    showMemberMenu();
                }
            }
        }
    }

    private void showLoginMenu() {
        System.out.println("=== 도서 관리 시스템 ===");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.print("선택: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> userManager.registerUserThrough(scanner);
            case 2 -> sessionManager.login(scanner, userManager);
            case 3 -> {
                fileManager.saveData(userManager, bookManager);
                System.exit(0);
            }
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
        System.out.print("선택: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> bookManager.displayBooks();
            case 2 -> bookManager.loanBook(scanner, sessionManager.getLoginUser());
            case 3 -> bookManager.returnBook(scanner, sessionManager.getLoginUser());
            case 4 -> sessionManager.getLoginUser().displayLoanedBooks();
            case 5 -> sessionManager.logout();
            default -> System.out.println("잘못된 입력입니다.");
        }
    }

    private void showAdminMenu() {
        System.out.println("=== 관리자 메뉴 ===");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 조회");
        System.out.println("3. 대출중인 책 목록 조회");
        System.out.println("4. 로그아웃");
        System.out.print("선택: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> bookManager.registerBookThrough(scanner);
            case 2 -> bookManager.displayBooks();
            case 3 -> bookManager.displayLoanedBooks();
            case 4 -> sessionManager.logout();
            default -> System.out.println("잘못된 입력입니다.");
        }
    }
}
