package me.sungbin.user;

public class Member extends User {

    public Member(String id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
