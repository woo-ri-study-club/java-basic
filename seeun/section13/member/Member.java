package section13.member;

public class Member extends BaseMember {

    public Member(String id, String name, String password) {
        super(id, name, password);
    }

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

    @Override
    public void selectOption(int option, MemberService memberService) {
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
                memberService.logout();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}
