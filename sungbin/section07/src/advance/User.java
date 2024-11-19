package advance;

public class User {

    private String username;

    private String password;

    public User(String username, String password) {
        this.username = username;
        updatePassword(password);
    }

    public String getUsername() {
        return username;
    }

    protected boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    private void updatePassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
            return;
        }

        System.out.println("비밀번호가 너무 짧습니다.");
    }
}
