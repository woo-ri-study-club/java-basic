package mission12.user;


public class AdminUser implements User {
    private String id;
    private String password;
    private String name;


    public AdminUser(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean hasUserById(String id) {
        return this.id.equals(id);
    }


    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

}
