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

    public void registerUser(User user) {
        if (checkAlreadyHasSameId(user.getId())) return;
        users.add(user);
        System.out.println("회원가입이 완료되었습니다.");
    }

    public void logIn(String id, String password, MenuView view) {
        User user = getUserById(id);
        if (user == null) {
            System.out.println("일치하는 id가 없습니다.");
            return;
        }
        if (!user.checkPassword(password)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }
        System.out.println("로그인에 성공했습니다.");
        showViewAfterLogin(view, user);
    }

    private User getUserById(String id) {
        for (User user : users) {
            if (user.hasUserById(id)) {
                return user;
            }
        }
        return null;
    }

    public void showViewAfterLogin(MenuView view, User user) {
        user.showMenuView(view);
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
        for (User user : users) {
            if (user.hasUserById(id)) {
                return true;
            }
        }
        return false;
    }
}
