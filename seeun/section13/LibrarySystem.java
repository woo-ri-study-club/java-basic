package section13;

import section13.member.*;

import java.util.Scanner;

public class LibrarySystem {

    private static final Scanner scanner = new Scanner(System.in);
    private final MemberService memberService;
    private BaseMember baseMember;

    public LibrarySystem() {
        this.memberService = new MemberService();
    }

    public void run() {
        while (true) {
            baseMember = memberService.getLoginMember();
            baseMember.displayMenu();
            int option = scanner.nextInt();
            baseMember.selectOption(option, memberService);
         }
    }
}
