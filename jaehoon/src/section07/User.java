package section07;

public class User {

  private String name;
  private String password;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void changePassword(String password, String newPassword) {
    checkCurrentPassword(password);
    this.password = newPassword;
    System.out.println("비밀번호가 성공적으로 변경되었습니다.");
  }

  public void checkCurrentPassword(String currentPassword) {
    if (!this.password.equalsIgnoreCase(currentPassword)) {
      throw new IllegalArgumentException("현재 비밀번호가 일치하지 않습니다.");
    }
  }

}
