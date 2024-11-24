package mission12;

public class RegularUser extends User {

    public RegularUser(String name, String id, String password) {
        super(name, id, password);
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
