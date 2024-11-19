package section7.mission3;

public class UserAccountTest {


    public static void main(String[] args) {

        User user = new User("이", "lee@email.com", "010-1111-2222", "password1");
        Account account = new Account(user, 001);

        System.out.println(user);
        System.out.println(account);
        System.out.println();

        System.out.println("**잘못된 비밀번호로 로그인 시도**");
        account.login("wrongpassword");

        System.out.println("**옳은 비밀번호로 로그인 시도**");
        account.login("password1");
        System.out.println();

        System.out.println("**잘못된 기존 비밀번호로 변경 시도**");
        user.changePassword("wrong", "newpassword1");

        System.out.println("**옳은 기존 비밀번호로 변경 시도**");
        user.changePassword("password1", "newpassword1");
        System.out.println();

        System.out.println("비밀번호 변경 후 account 확인");
        System.out.println(account);
    }
}
