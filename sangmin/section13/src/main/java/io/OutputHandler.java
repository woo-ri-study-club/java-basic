package io;

public class OutputHandler {
    private OutputHandler() {
    }

    public static void printMainManu() {
        System.out.println("=== 도서 관리 시스템 ===");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.print("선택: ");
    }

    public static void printLoginMenu() {
        System.out.println("=== 로그인 ===");
    }

    public static void printLoginId() {
        System.out.print("아이디: ");
    }

    public static void printLoginPassword() {
        System.out.print("비밀번호: ");
    }

    public static void printMemberMenu() {
        System.out.println("=== 회원 메뉴 ===");
        System.out.println("1. 책 조회");
        System.out.println("2. 책 대출");
        System.out.println("3. 책 반납");
        System.out.println("4. 대출 목록 조회");
        System.out.println("5. 로그아웃");
        System.out.print("선택: ");
    }

    public static void printAdminMenu() {
        System.out.println("=== 관리자 메뉴 ===");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 조회");
        System.out.println("3. 대출 회원 목록 조회");
        System.out.println("4. 로그아웃");
        System.out.print("선택: ");
    }

    public static void printSignUpMenu() {
        System.out.println("=== 회원 가입 ===");
    }

    public static void printSignUpId() {
        System.out.print("아이디: ");
    }

    public static void printSignUpPassword() {
        System.out.print("비밀번호: ");
    }

    public static void printSignUpName() {
        System.out.print("이름: ");
    }

    public static void printSignSuccess(String name) {
        System.out.println(name + "님 회원가입을 축하합니다.");
    }

    public static void printLoginSuccess(String name) {
        System.out.println(name + "님 환영합니다.");
    }
}
