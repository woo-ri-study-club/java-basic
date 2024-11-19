package section7.mission3;

public class Account {
    private User user;
    private int accountNumber;

    public Account(User user, int accountNumber) {
        this.user = user;
        this.accountNumber = accountNumber;
    }

    protected void errorMessage() {
        System.out.println("account 처리 중 error 발생");
    }

    public void login(String inputPassword) {
        if (user.verifyPassword(inputPassword)) {
            System.out.println("로그인에 성공했습니다.");
            return;
        }
        errorMessage();
        System.out.println("로그인에 실패하였습니다.");
    }

    @Override
    public String toString() {
        return "user: " + user + ", accountNumber: " + accountNumber;
    }
}
