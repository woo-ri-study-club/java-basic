package advance;

public class Main {
    public static void main(String[] args) {
        User user = new User("양성빈", "1q2w3e4r");
        Account account = new Account(user, 1000000);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.deposit(100);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account.withdraw(50000, "1q2w3e4r");
            }
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("최종 잔액: " + account.getBalance());
    }
}

