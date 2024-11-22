public class Account {
    private User user;
    private int balance;

    public Account(User user, int balance) {
        this.user = user;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야합니다.");
        }
        balance += amount;
    }

    public void withdraw(int amount, String password) {
        if (balance < amount) {
            throw new IllegalArgumentException("예금이 부족합니다.");
        }
        if (user.notMatchPassword(password)) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        balance -= amount;
    }

    public String getUserName() {
        return user.getName();
    }

    public int getBalance() {
        return balance;
    }
}
