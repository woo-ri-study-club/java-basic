package mission06.advanced;

public class Account {
    private User user;
    private final int ACCOUNT_NUMBER;
    private int balance;

    public Account(User user, int accountNumber, int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("잔액은 0 이상이어야 합니다.");
        }
        this.user = user;
        this.ACCOUNT_NUMBER = accountNumber;
        this.balance = balance;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (user.changePassword(oldPassword, newPassword)) {
            System.out.println("비밀번호가 변경되었습니다.");
            return true;
        }
        System.out.println("비밀번호가 다릅니다.");
        return false;
    }

    public String getAccountInfo(String userId) {
        if (userId == null || userId.isEmpty()) {
            return "유효하지 않은 사용자 ID입니다.";
        }
        if(user.getUserId().equals(userId)) {
            return "계좌번호: " + this.ACCOUNT_NUMBER + ", 사용자 이름: " + user.getName()+", 잔액: " + this.balance + "원";
        }
        return "계좌 정보를 확인할 수 없습니다.";
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        this.balance -= amount;
        return true;
    }

}