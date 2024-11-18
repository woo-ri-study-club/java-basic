package section07;

public class Account {

  private String accountId;
  private User user;

  public Account(String accountId, User user) {
    this.accountId = accountId;
    this.user = user;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getNickname() {
    return user.getName();
  }

  public void requestUserNameChange(String newName) {
    user.changeName(newName);
  }

  public void requestPasswordChange(String oldPassword, String newPassword) {
    user.changePassword(oldPassword, newPassword);
  }
}
