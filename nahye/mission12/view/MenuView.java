package mission12.view;

import mission12.controller.MenuController;
import mission12.user.AdminUser;
import mission12.user.StandardUser;

public class MenuView {

    private final MenuController menuController;

    public MenuView(MenuController menuController) {
        this.menuController = menuController;
    }

    public void showMainView() {
        while (true) {
            System.out.println("=== 도서 관리 시스템===");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.print("선택: ");

            if (menuController.showMainMenuByChoice()) {
                break;
            }
        }
    }

    public void showWhenAdminLogin(AdminUser user) {

        while (true) {
            System.out.println("=== 관리자 메뉴 ===");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("3. 대출 회원 목록 조회");
            System.out.println("4. 로그아웃");
            System.out.print("선택 : ");

            if (menuController.showAdminMenuByChoice()) {
                break;
            }
        }

    }

    public void showWhenUserLogin(StandardUser user) {
        while (true) {
            System.out.println("=== 회원 메뉴 ===");
            System.out.println("1. 책 조회");
            System.out.println("2. 책 대출");
            System.out.println("3. 책 반납");
            System.out.println("4. 대출 목록");
            System.out.println("5. 로그아웃");
            System.out.print("선택 : ");

            if (menuController.showUserMenuByChoice(user)) {
                break;
            }
        }
    }
}