package section7.mission3;

import java.util.Objects;

public class User {
    public String username;
    protected String email;
    String phoneNumber;
    private String password;

    public User(String username, String email, String phoneNumber, String password) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    protected boolean verifyPassword(String inputPassword) {
        Objects.requireNonNull(inputPassword, "잘못된 비밀번호 입력입니다.");
        return password.equals(inputPassword);
    }

    public boolean changePassword(String currentPassword, String newPassword) {
        if (verifyPassword(currentPassword)) {
            this.password = newPassword;
            System.out.println("비밀번호가 변경되었습니다");
            return true;
        }
        System.out.println("입력한 기존 비밀번호가 옳지 않습니다. 비밀번호 변경을 취소합니다.");
        return false;
    }

    @Override
    public String toString() {
        return "username: " + username + ", email: " + email + ", phoneNumber: " + phoneNumber + ", password: " + password;
    }
}
