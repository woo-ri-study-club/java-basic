package mission12;

public class AdminUser extends User{
    public AdminUser(String name, String id, String password) {
        super(name, id, password);
    }

    @Override
    public boolean isNotAdmin() {
        return false;
    }
}
