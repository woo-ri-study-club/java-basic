package section13.member;

public abstract class BaseMember {
    private String id;
    private String name;
    private String password;
    private boolean isAdmin;

    abstract void displayMenu();

    boolean isAdmin() {
        return isAdmin;
    }

    public boolean verifyPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}
