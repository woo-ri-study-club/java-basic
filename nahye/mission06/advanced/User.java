package mission06.advanced;

public class User {
    private String userId;
    private String password;
    protected String name;
    String email;

    public User(String userId, String password, String name, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (validatePassword(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
}
