package section13;

import section13.member.MemberService;

public class Application {

    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.run();
    }
}
