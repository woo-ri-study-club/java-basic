package section13.member;

public abstract class BaseMember {
    private String id;
    private String name;
    private String password;

    public BaseMember() {
    }

    public BaseMember(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public abstract void displayMenu();

    public boolean verifyPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public void selectOption(int option, MemberService memberService) {
    }
}
