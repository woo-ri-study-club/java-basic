package section07;

public class AccountMain {

  public static void main(String[] args) {
    User user = new User("jaehoon", "password_123");

    Account account = new Account("noah123", user);

    System.out.println("사용자 아이디: " + account.getAccountId()); // public 메서드로 접근 가능
    System.out.println("사용자 이름: " + account.getNickname()); // public 메서드로 접근 가능

    account.requestUserNameChange("noah");
    System.out.println("변경된 사용자 이름: " + account.getNickname()); // public 메서드로 접근 가능
    System.out.println();

    try {
      System.out.println("### 비밀번호 변경요청 ###");
      account.requestPasswordChange("password_123", "New_Password123");
      System.out.println("비밀번호가 성공적으로 변경되었습니다.");
      System.out.println();

      System.out.println("### 잘못된 비밀번호 변경요청 ###");
      account.requestPasswordChange("Invalid_Password", "New_Password456");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}

