package section13.member;

public class Session {
    private static volatile Session instance;
    private BaseMember loginMember;

    private Session() {
        loginMember = new Guest();
    }

    public static Session getInstance() {
        if (instance == null) {
            synchronized (Session.class) {
                if (instance == null) {
                    instance = new Session();
                }
            }
        }
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
