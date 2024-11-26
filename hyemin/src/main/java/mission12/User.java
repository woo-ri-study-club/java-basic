package mission12;

public abstract class User {
    private String name;
    private String id;
    private String password;

    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isPasswordInvalid(String password) {
        return !this.password.equals(password);
    }

    public abstract boolean isNotAdmin();

}
