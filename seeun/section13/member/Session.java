package section13.member;

public class Session {
    private static final Session instance = new Session();
    private BaseMember loginMember;

    private Session() {
        loginMember = new Guest();
    }

    public static Session getInstance() {
        return instance;
    }

    public void registLoginMember(BaseMember member) {
        loginMember = member;
    }

    public BaseMember getLoginMember() {
        return loginMember;
    }

    public void clear() {
        loginMember = new Guest();
    }
}
