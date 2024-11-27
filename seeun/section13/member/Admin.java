package section13.member;

public class Admin extends BaseMember {
    public Admin(String id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("=== 관리자 메뉴 ===");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 조회");
        System.out.println("3. 대출 회원 목록 조회");
        System.out.println("4. 로그아웃");
        System.out.print("선택: ");
    }

    @Override
    public void selectOption(int option, MemberService memberService) {
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
                memberService.logout();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
