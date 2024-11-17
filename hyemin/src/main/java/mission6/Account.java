package mission6;

public class Account {
    private final User user;
    private int balance;

    public Account(User user) {
        this.user = user;
    }

    public String getUsername() {
        return user.getUsername();
    }

    public void changeUserPassword(String password, String newPassword) {
        user.changePassword(password, newPassword);
    }

    public void deposit(int amount) {
        if (!isAmountValid(amount)) {
            throw new IllegalArgumentException("유효하지 않은 금액입니다.");
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (!isAmountValid(amount) || balance - amount < 0) {
            throw new IllegalArgumentException("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
