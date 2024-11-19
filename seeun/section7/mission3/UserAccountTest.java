package section7.mission3;

public class UserAccountTest {


    public static void main(String[] args) {

        User user = new User("이", "lee@email.com", "010-1111-2222", "password1");
        Account account = new Account(user, 001, 10000);

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
        System.out.println();

        System.out.println("**금액 입금 시도**");
        account.deposit(2000);

        System.out.println("**잔액 확인**");
        System.out.println(account);

        System.out.println("**잔액 이상의 금액 인출 시도 (실패)**");
        account.withdraw(15000);

        System.out.println("**잔액 이하의 금액 인출 시도**");
        account.withdraw(11000);

        System.out.println("**잔액 확인**");
        System.out.println(account);
    }
}
