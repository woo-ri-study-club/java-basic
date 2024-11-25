package mission12.user;


import mission12.view.MenuView;

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

    @Override
    public void showMenuView(MenuView view) {
        view.showWhenAdminLogin(this);
    }
}
