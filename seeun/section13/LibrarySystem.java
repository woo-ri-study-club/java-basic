package section13;

import section13.member.*;

import java.util.Scanner;

public class LibrarySystem {

    private static final Scanner scanner = new Scanner(System.in);
    private final MemberService memberService;
    private BaseMember baseMember;
    private static Session session;

    public LibrarySystem() {
        this.memberService = new MemberService();
        session = Session.getInstance();
    }

    public void run() {
        while (true) {
            baseMember = session.getLoginMember();
            baseMember.displayMenu();
            int option = scanner.nextInt();
            menu(baseMember, option);
        }
    }

    private void menu(BaseMember baseMember, int option) {
        if(baseMember instanceof Guest){
            guestMenu(option);
        } else if (baseMember instanceof Member) {
            memberMenu(option);
        } else {
            adminMenu(option);
        }
    }

    private void guestMenu(int option) {
        switch (option){
            case 1:
                memberService.register();
                break;
            case 2:
                memberService.login(session);
                break;
            case 3:
                System.out.println("**종료합니다**");
                System.exit(0);
                break;
        }
    }

    private void memberMenu(int option) {
        switch (option) {
            case 1:
                System.out.println("책 조회");
                break;
            case 2:
                System.out.println("책 대여");
                break;
            case 3:
                System.out.println("책 반납");
                break;
            case 4:
                System.out.println("대출 도서 조회");
                break;
            case 5:
                memberService.logout(session);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }

    private void adminMenu(int option) {
        switch (option) {
            case 1:
                System.out.println("책 등록");
                break;
            case 2:
                System.out.println("책 조회");
                break;
            case 3:
                System.out.println("대출 도서 회원 목록");
                break;
            case 4:
                memberService.logout(session);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
