package section13;

public class Menu {

  public static void showMainMenu() {
    System.out.println("=== 도서 관리 시스템 ===");
    System.out.println("1. 회원가입");
    System.out.println("2. 로그인");
    System.out.println("3. 종료");
    System.out.print("선택: ");
  }

  public static void showUserMenu() {
    System.out.println("=== 회원 메뉴 ===");
    System.out.println("1. 등록된 모든 책 조회");
    System.out.println("2. 책 대출");
    System.out.println("3. 책 반납");
    System.out.println("4. 대출 목록 조회");
    System.out.println("5. 로그아웃");
    System.out.print("선택: ");
  }

  public static void showAdminMenu() {
    System.out.println("=== 관리자 메뉴 ===");
    System.out.println("1. 책 등록");
    System.out.println("2. 등록된 모든 책 조회");
    System.out.println("3. 대출 회원 목록 조회");
    System.out.println("4. 로그아웃");
    System.out.print("선택: ");
  }

}
