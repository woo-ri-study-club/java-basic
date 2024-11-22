package advance;

public class Account {

    private User user;

    long balance;

    private final Object lock = new Object();

    public Account(User user, long balance) {
        this.user = user;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            synchronized (lock) {
                balance += amount;
                System.out.println("입금이 정상적으로 처리되었습니다. 현재 잔액은 " + balance);
            }
        }
    }

    public void withdraw(int amount, String password) {
        synchronized (lock) {
            if (authenticateUser(password) && amount <= balance) {
                balance -= amount;
                System.out.println("출금이 정상적으로 처리되었습니다. 현재 잔액은 " + balance);
                return;
            }

            System.out.println("인증에 실패하였거나 잔액이 부족합니다.");
        }
    }

    private boolean authenticateUser(String password) {
        return user.verifyPassword(password);
    }
}
