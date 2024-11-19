public class Account {
    private final User user;
    private final int balance;

    public Account(User user, int balance) {
        this.user = user;
        this.balance = balance;
    }

    public Account deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야합니다.");
        }
        return new Account(user, balance + amount);
    }

    public Account withdraw(int amount, String password) {
        if (balance < amount) {
            throw new IllegalArgumentException("예금이 부족합니다.");
        }
        if (user.notMatchPassword(password)) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        return new Account(user, balance - amount);
    }

    public String getUserName() {
        return user.getName();
    }

    public int getBalance() {
        return balance;
    }
}
