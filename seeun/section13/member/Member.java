package section13.member;

public class Member extends BaseMember {

    @Override
    public void displayMenu() {
        System.out.println("=== 회원 메뉴 ===");
        System.out.println("1. 책 조회");
        System.out.println("2. 책 대출");
        System.out.println("3. 책 반납");
        System.out.println("4. 대출 목록 조회");
        System.out.println("5. 로그아웃");
        System.out.print("선택: ");
    }

}
