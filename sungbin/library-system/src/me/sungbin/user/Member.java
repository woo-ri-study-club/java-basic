package me.sungbin.user;

public class Member extends User {

    private static final long serialVersionUID = 1L;

    public Member(String id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
