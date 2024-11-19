package mission6.advanced.domain;

public class Account {
    private User user;
    private String userId;

    public Account(User user, String userId) {
        this.user = user;
        this.userId = userId;
    }

    public String displayAccount() {
        return user.displayUser() + ", 아이디: " + userId;
    }
}
