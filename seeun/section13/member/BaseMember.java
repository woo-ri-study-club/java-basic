package section13.member;

public abstract class BaseMember {
    private String id;
    private String name;
    private String password;
    private boolean isAdmin;

    public BaseMember() {
    }

    public BaseMember(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    abstract void displayMenu();

    boolean isAdmin() {
        return isAdmin;
    }

    public boolean verifyPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}
