package section07;

public class AccountMain {

  public static void main(String[] args) {
    // User, Account 생성
    User user = new User("jaehoon", "password_123");
    Account account = new Account(user);

    // User 정보 출력
    System.out.println("###  User 정보 출력 ###");
    System.out.println("계좌 아이디: " + account.getAccountId()); // public 메서드로 접근 가능
    System.out.println("계좌 잔액: " + account.getBalance()); // protected 메서드로 접근 가능
    System.out.println();

    // NOTE: 비밀번호 변경 요청
    try {
      System.out.println("### 비밀번호 변경요청 ###");
      account.requestPasswordChange("password_123", "New_Password123");
      System.out.println();

      System.out.println("### 잘못된 비밀번호 변경요청 ###");
      account.requestPasswordChange("Invalid_Password", "New_Password456");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
    System.out.println();

    // NOTE: 입금 & 출금 요청
    try {
      System.out.println("### 입금 요청 ###");
      account.deposit(100000);
      System.out.println();

      System.out.println("### 출금 요청 ###");
      account.withdraw("New_Password123", 50000);
      System.out.println();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }

    // NOTE: 잔액을 초과하는 출금 요청
    try {
      System.out.println("### 잔액을 초과하는 출금 요청 ###");
      account.withdraw("New_Password123", 1000000);
      System.out.println();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
    System.out.println();

    // NOTE: 잘못된 패스워드로 출금 요청
    try {
      System.out.println("### 잘못된 패스워드로 출금 요청 ###");
      account.withdraw("Invalid_Password", 50000);
      System.out.println();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
    System.out.println();

  }
}
