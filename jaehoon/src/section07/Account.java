package section07;

public class Account {

  private String accountId;
  private User user;

  public Account(String accountId, User user) {
    this.accountId = accountId;
    this.user = user;
  }

  // 계정 ID 가져오기
  public String getAccountId() {
    return accountId;
  }

  // User의 닉네임 가져오기
  public String getNickname() {
    return user.getName();
  }

  // User 이름 변경 요청
  public void requestUserNameChange(String newName) {
    user.changeName(newName);
  }

  // 비밀번호 변경 요청
  public void requestPasswordChange(String oldPassword, String newPassword) {
    user.changePassword(oldPassword, newPassword);
  }
}