package section07;

import java.util.UUID;

public class Account {

  private UUID accountId;
  private User user;
  private volatile int balance;

  public Account(User user) {
    this(user, 0);
  }

  public Account(User user, int balance) {
    this.accountId = UUID.randomUUID();
    this.user = user;
    this.balance = balance;
  }

  protected int getBalance() {
    return balance;
  }

  // 계좌 ID 가져오기
  public UUID getAccountId() {
    return accountId;
  }

  // 비밀번호 변경 요청 메서드
  public void requestPasswordChange(String password, String newPassword) {
    user.changePassword(password, newPassword);
  }

  // 입금(deposit) 메서드
  public void deposit(int amount) {
    validateDepositAmount(amount);
    synchronized (this) {
      balance += amount;
      System.out.println("입금이 정상적으로 처리되었습니다. 현재 잔액은 " + balance);
    }
  }

  // 출금(withdraw) 메서드
  public void withdraw(String password, int amount) {
    validateWithdrawAmount(amount);
    synchronized (this) {
      user.checkCurrentPassword(password);
      balance -= amount;
      System.out.println("출금이 정상적으로 처리되었습니다. 현재 잔액은 " + balance);
    }
  }

  private void validateDepositAmount(int amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("금액이 올바르지 않습니다. 다시 확인해주세요.");
    }
  }

  private void validateWithdrawAmount(int amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("금액이 올바르지 않습니다. 다시 확인해주세요.");
    }
    if (amount > balance) {
      throw new IllegalStateException("잔액이 부족합니다. 현재 잔액은 " + balance);
    }
  }
}
