package section13.member;

import section13.member.data.LoginData;
import section13.member.data.RegistData;

import java.util.Scanner;

public class Console {

    private static final Scanner scanner = new Scanner(System.in);
    private BaseMember member;

    public static RegistData registConsole() {
        System.out.println("**회원가입**");
        System.out.print("사용할 아이디 입력: ");
        String inputId = scanner.next();
        System.out.print("사용할 이름 입력: ");
        String inputName = scanner.next();
        System.out.print("사용할 비밀번호 입력: ");
        String inputPassword = scanner.next();
        System.out.print("관리자이십니까?(N/y): ");
        String inputCheck = scanner.next();

        if (inputCheck.equalsIgnoreCase("y")) {
            System.out.print("Admin key를 입력해주세요: ");
            String inputKey = scanner.next();
            return new RegistData(inputId, inputName, inputPassword, inputKey);
        }
        return new RegistData(inputId, inputName, inputPassword);
    }

    public static LoginData loginConsole() {
        System.out.println("**로그인**");
        System.out.print("아이디 입력: ");
        String inputId = scanner.next();
        System.out.print("비밀번호 입력: ");
        String inputPassword = scanner.next();

        return new LoginData(inputId, inputPassword);
    }

    public static void logoutConsole() {
        System.out.println("**로그아웃**");
    }

}
