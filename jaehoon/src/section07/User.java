package section07;

import static java.util.Objects.isNull;

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

  public void changeName(String newName) {
    if (isNull(newName) || newName.isBlank()) {
      throw new IllegalArgumentException("이름은 비어 있거나 공백이 을 수 없습니다.");
    }
    this.name = newName;
    System.out.println("이름이 성공적으로 변경되었습니다.");
  }

  public void changePassword(String oldPassword, String newPassword) {
    validateOldPassword(oldPassword);
    validateNewPassword(newPassword);
    this.password = newPassword;
    System.out.println("비밀번호가 성공적으로 변경되었습니다.");
  }

  private void validateOldPassword(String oldPassword) {
    if (!password.equalsIgnoreCase(oldPassword)) {
      throw new IllegalArgumentException("현재 비밀번호가 일치하지 않습니다.");
    }
  }

  private void validateNewPassword(String newPassword) {
    if (isNull(newPassword) || newPassword.isBlank()) {
      throw new IllegalArgumentException("새 비밀번호는 비어 있거나 공백일 수 없습니다.");
    }
  }
}