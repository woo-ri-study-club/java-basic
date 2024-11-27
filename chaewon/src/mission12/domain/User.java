package mission12.domain;

public abstract class User {
    private final String userName;
    private final String userId;
    private final String password;

    public User(String userName, String userId, String password) {
        this.userName = userName;
        this.userId = userId;
        this.password = password;

        validateUser();
    }

    public void validateUser() {
        validateField(userName, "사용자 이름을 입력해야 합니다.");
        validateField(userId, "아이디를 입력해야 합니다.");
        validateField(password, "비밀번호를 입력해야 합니다.");
    }

    private void validateField(String userName, String s) {
        if (userName == null || userName.isBlank()) {
            throw new IllegalArgumentException(s);
        }
    }

    public boolean isNotSamePassword(String password) {
        return !password.equals(this.password);
    }

    public String getUserId() {
        return userId;
    }
}
