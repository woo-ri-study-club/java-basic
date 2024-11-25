package mission12.service;

import mission12.user.AdminUser;
import mission12.user.StandardUser;
import mission12.user.User;
import mission12.view.MenuView;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new AdminUser("admin", "admin", "admin"));
    }

    public void registerUser(String id, String password, String name) {
        if (checkAlreadyHasSameId(id)) return;
        User user = new StandardUser(id, password, name);
        users.add(user);
        System.out.println("회원가입이 완료되었습니다.");
    }

    public List<User> getUsers() {
        return users;
    }

    public void logIn(String id, String password, MenuView view) {
        boolean foundId = false;
        for (User checkUser : users) {
            if (checkUser.getId().equals(id)) {
                foundId = true;
                if (checkUser.checkPassword(password)) {
                    System.out.println("로그인에 성공했습니다.");
                    if (checkUser instanceof AdminUser) {
                        view.showWhenAdminLogin((AdminUser) checkUser);
                    } else if (checkUser instanceof StandardUser) {
                        view.showWhenUserLogin((StandardUser) checkUser);
                    }
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
                break;
            }
        }
        if (!foundId) {
            System.out.println("일치하는 id가 없습니다.");
        }
    }

    public void showUserBorrowed() {
        for (User checkUser : users) {
            if (checkUser instanceof StandardUser
                    && ((StandardUser) checkUser).hasBorrowedBook()) {
                System.out.println(checkUser);
            }
        }
    }

    private boolean checkAlreadyHasSameId(String id) {
        for(User user : users) {
            if(user.getId().equals(id)) {
                System.out.println("회원가입에 실패했습니다. 같은 ID가 이미 존재합니다.");
                return true;
            }
        }
        return false;
    }
}
