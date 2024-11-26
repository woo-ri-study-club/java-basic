package section13.member;

import section13.member.config.AdminConifg;

import java.util.*;

public class MemberService {

    private static final Scanner scanner = new Scanner(System.in);
    private static Map<String, BaseMember> members = new HashMap<>();
    private BaseMember baseMember;

    public void run() {
        baseMember = new Guest();
        baseMember.displayMenu();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("**회원가입**");
                System.out.print("사용할 아이디 입력: ");
                String inputId = scanner.next();
                System.out.println("사용할 이름 입력: ");
                String inputName = scanner.next();
                System.out.println("사용할 비밀번호 입력");
                String inputPassword = scanner.next();
                System.out.println("관리자이십니까?(N/y)");
                String inputCheck = scanner.next();
                if(inputCheck.equalsIgnoreCase("y")){
                    System.out.print("Admin key를 입력해주세요: ");
                    String inputKey = scanner.next();
                    registerAdmin(inputId, inputName, inputPassword, inputKey);
                    break;
                }
                register(inputId, inputName, inputPassword);
                break;

            case 2:
                System.out.println("**로그인**");
                System.out.print("아이디 입력: ");
                inputId = scanner.next();
                System.out.println("비밀번호 입력");
                inputPassword = scanner.next();
                login(inputId, inputPassword);
                break;

            case 3:
                System.out.println("**종료합니다**");
                break;

            default:
                throw new IllegalArgumentException("잘못된 입력입니다.");
        }

    }

    private void registerAdmin(String id, String name, String password, String key) {
        validateAdminKey(key);
        validateDuplicateId(id);
        members.put(id, new Admin(id, name, password));
        System.out.println("관리자 회원가입이 완료되었습니다");
    }

    public void register(String id, String name, String password) {
        validateDuplicateId(id);
        members.put(id, new Member(id, name, password));
        System.out.println("일반 회원가입이 완료되었습니다");
    }

    public void login(String id, String password) {
        BaseMember loginMember = findMemberById(id);
        loginMember.verifyPassword(password);
        //세션 처리
    }

    public void logout() {
        //세션 처리
    }

    private static BaseMember findMemberById(String id) {
        if(!members.containsKey(id)){
            throw new IllegalArgumentException("존재하지 않는 id입니다.");
        }
        return members.get(id);
    }

    private static void validateDuplicateId(String id) {
        if(members.containsKey(id)){
            throw new IllegalArgumentException("이미 존재하는 id입니다.");
        }
    }

    private static void validateAdminKey(String key) {
        if(!AdminConifg.ADMIN_KEY.equals(key)){
            throw new IllegalArgumentException("관리자 키가 올바르지 않습니다.");
        }
    }
}
