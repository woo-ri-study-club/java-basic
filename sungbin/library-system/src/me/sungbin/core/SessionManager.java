package me.sungbin.core;

import me.sungbin.user.User;
import me.sungbin.user.UserManager;

import java.util.Scanner;

public class SessionManager {

    private User loginUser;

    public boolean isLogin() {
        return loginUser != null;
    }

    public boolean isAdmin() {
        return loginUser != null && loginUser.isAdmin();
    }

    public User getLoginUser() {
        return loginUser;
    }

    public void login(Scanner scanner, UserManager userManager) {
        System.out.println("ID: ");
        String id = scanner.nextLine();

        System.out.println("비밀번호: ");
        String password = scanner.nextLine();

        User user = userManager.findUserBy(id);

        if (user == null || user.notValidPassword(password)) {
            System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
        } else {
            loginUser = user;
            System.out.println("로그인 성공! " + user.getId() + "님 환영합니다.");
        }
    }

    public void logout() {
        if (loginUser != null) {
            System.out.println(loginUser.getId() + "님 로그아웃 되었습니다.");
            loginUser = null;
        } else {
            System.out.println("현재 로그인 상태가 아닙니다.");
        }
    }
}
