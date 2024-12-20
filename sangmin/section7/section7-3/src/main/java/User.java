public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean matchPassword(final String password) {
        return this.password.equals(password);
    }

    public boolean notMatchPassword(final String password) {
        return !matchPassword(password);
    }

    public String getName() {
        return name;
    }
}
