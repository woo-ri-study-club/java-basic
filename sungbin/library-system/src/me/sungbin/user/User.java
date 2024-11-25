package me.sungbin.user;

public abstract class User {

    private final String id;

    private final String name;

    private final String password;

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public abstract boolean isAdmin();
}
