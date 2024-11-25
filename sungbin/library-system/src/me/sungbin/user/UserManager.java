package me.sungbin.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManager {

    private final Map<String, User> users = new HashMap<>();

    public void registerUserThrough(Scanner scanner) {
        System.out.print("이름: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        System.out.print("회원 타입(1: 일반, 2: 관리자)");
        int userType = scanner.nextInt();
        scanner.nextLine();

        if (validateRegisterUser(id)) return;

        User user = (userType == 2) ? new Admin(id, name, password) : new Member(id, name, password);
        users.put(id, user);

        System.out.println("회원가입이 완료되었습니다.");
    }

    public User findUserBy(String id) {
        return users.get(id);
    }

    public Map<String, User> getUsers() {
        return Collections.unmodifiableMap(users);
    }

    private boolean validateRegisterUser(String id) {
        if (users.containsKey(id)) {
            System.out.println("이미 존재하는 ID입니다.");
            return true;
        }
        return false;
    }
}
