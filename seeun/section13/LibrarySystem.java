package section13;

import section13.member.*;

import java.util.Scanner;

public class LibrarySystem {

    private static final Scanner scanner = new Scanner(System.in);
    private final MemberService memberService;
    private BaseMember baseMember;
    private Session session;

    public LibrarySystem() {
        this.memberService = new MemberService();
        session = Session.getInstance();
    }

    public void run() {
        while (true) {
            baseMember = session.getLoginMember();
            baseMember.displayMenu();
            int option = scanner.nextInt();
            baseMember.selectOption(option, memberService);
         }
    }
}
