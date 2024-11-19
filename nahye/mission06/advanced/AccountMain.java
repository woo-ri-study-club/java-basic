package mission06.advanced;

public class AccountMain {
    public static void main(String[] args) {
        User user = new User("user1", "1111","KIM", "kim@aaa.com");
        Account account = new Account(user, 12345678, 5000);

        String accountInfo = account.getAccountInfo();
        System.out.println(accountInfo);
        account.changePassword("1111","2222");
    }
}
