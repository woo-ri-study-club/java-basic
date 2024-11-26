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

}
