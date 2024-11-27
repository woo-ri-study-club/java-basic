package section13.member.data;

public class LoginData {
    private String id;
    private String password;

    public LoginData(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
