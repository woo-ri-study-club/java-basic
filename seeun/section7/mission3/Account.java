package section7.mission3;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Account {
    private User user;
    private int accountNumber;
    private int balance = 0;

    public Account(User user, int accountNumber, int balance) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected void userErrorMessage() {
        System.out.println("회원 처리 중 에러가 발생했습니다.");
    }

    protected void accountErrorMessage() {
        System.out.println("계좌 처리 중 에러가 발생했습니다.");
    }

    public void login(String inputPassword) {
        if (user.verifyPassword(inputPassword)) {
            System.out.println("로그인에 성공했습니다.");
            return;
        }
        userErrorMessage();
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (validateAmount(amount) && verifyBalance(amount)) {
            System.out.println("출금되었습니다.");
        }
    }

    private boolean validateAmount(int amount){
        if (amount <= 0) {
            printError("잘못된 출금액 입력입니다. 0 이상의 금액만 출금가능합니다.");
            return false;
        }
        return true;
    }

    private boolean verifyBalance(int amount) {
        if(balance - amount >= 0){
            balance -= amount;
            return true;
        }
        printError("잔액이 부족합니다.");
        return false;
    }

    private void printError(String errorMessage) {
        accountErrorMessage();
        System.out.println(errorMessage);
    }

    @Override
    public String toString() {
        return "user: " + user + ", accountNumber: " + accountNumber + ", balance: " + balance;
    }
}
