package section13;

import section13.member.*;

import java.util.Scanner;

public class LibrarySystem {

    private static final Scanner scanner = new Scanner(System.in);
    private final MemberService memberService;
//    private final LibraryService libraryService;
    private BaseMember baseMember;
    private static Session session;
    private boolean running = true;


    public LibrarySystem() {
        this.memberService = new MemberService();
        session = Session.getInstance();

//        this.libraryService = new LibraryService();
    }

    public void run() {
        while (running) {
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
                running = false;
                break;
        }
    }

    private void memberMenu(int option) {
        switch (option) {
            case 1:
//                libraryService.displayBooks();
                break;
            case 2:
//                libraryService.checkoutBook();
                break;
            case 3:
//                libraryService.returnBook();
                break;
            case 4:
//                libraryService.displayCheckedOutBooks();
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
//                libraryService.registerBook();
                break;
            case 2:
//                libraryService.displayBooks();
                break;
            case 3:
//                libraryService.checkedOutMemberInfo();
                break;
            case 4:
                memberService.logout(session);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
