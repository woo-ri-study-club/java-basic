package mission12.domain;

public abstract class User {
    private final String userName;
    private final String userId;
    private final String password;

    public User(String userName, String userId, String password) {
        validateUser();

        this.userName = userName;
        this.userId = userId;
        this.password = password;
    }

    public void validateUser() {
        validateFieldIsBlank();
        validatePasswordPattern();
    }

    private void validateFieldIsBlank() {
        if (userName == null || userName.isBlank()) {
            throw new IllegalArgumentException("사용자 이름을 입력해야 합니다.");
        }
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("아이디를 입력해야 합니다.");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("비밀번호를 입력해야 합니다.");
        }
    }

    private void validatePasswordPattern() {
        if (password.matches("^(?!.*\\s)(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_]).{8,16}$")) {
            throw new IllegalArgumentException("비밀번호는 영문, 숫자, 특수문자(~!@#$%^&*_)를 조합한 8~16자리 문자열이어야 합니다.");
        }
    }

    public boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    public String getUserId() {
        return userId;
    }
}
