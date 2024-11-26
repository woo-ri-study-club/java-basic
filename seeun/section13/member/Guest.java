package section13.member;

public class Guest extends BaseMember {
    @Override
    public void displayMenu() {
        System.out.println("=== 도서 관리 시스템 ===");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.print("선택: ");
    }

    @Override
    public void selectOption(int option, MemberService memberService) {
        switch (option){
            case 1:
                memberService.register();
                break;
            case 2:
                memberService.login();
                break;
            case 3:
                System.out.println("**종료합니다**");
                System.exit(0);
                break;
        }
    }
}
