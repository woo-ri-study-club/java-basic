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
    checkAmount(amount);
    synchronized (this) {
      balance += amount;
      System.out.println("입금이 정상적으로 처리되었습니다. 현재 잔액은 " + balance);
    }
  }

  // 출금(withdraw) 메서드
  public void withdraw(String password, int amount) {
    user.checkCurrentPassword(password);
    checkAmount(amount);
    synchronized (this) {
      checkEnoughBalance(amount);
      balance -= amount;
      System.out.println("출금이 정상적으로 처리되었습니다. 현재 잔액은 " + balance);
    }
  }

  private void checkAmount(int amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("입,출금은 0 이상의 금액만 가능합니다.");
    }
  }

  private void checkEnoughBalance(int amount) {
    if (amount > balance) {
      throw new IllegalStateException("잔액이 부족합니다. 현재 잔액은 " + balance);
    }
  }
}
