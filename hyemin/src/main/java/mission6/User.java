package mission6;

// User 클래스
public class User {
    private String username;
    private String password;
    protected String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    void changePassword(String password, String newPassword) {
        if(!checkPassword(password)) {
            throw new IllegalArgumentException("현재 비밀번호를 올바로 입력하세요.");
        }
        validatePassword(newPassword);
        this.password = newPassword;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    private void validatePassword(String newPassword){
        if(newPassword == null || newPassword.isBlank()){
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
    }
}

