package me.sungbin.user;

public class Admin extends User {

    public Admin(String id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public boolean isAdmin() {
        return true;
    }
}
