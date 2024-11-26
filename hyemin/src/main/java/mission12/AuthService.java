package mission12;

public class AuthService {
    private final UserRepository userRepository;

    private User loggedInUser;
    public AuthService() {
        this.userRepository = new UserRepository();
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void login(String id, String password) {
        User user = userRepository.findById(id);
        if (user.isPasswordInvalid(password)) {
            throw new IllegalArgumentException("패스워드를 확인해주세요.");
        }
        loggedInUser = user;
        System.out.println("로그인 성공");
    }

    public void logout() {
        validateLogin();
        System.out.println(loggedInUser.getName() + "님이 로그아웃 되었습니다.");
        loggedInUser = null;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void validateLogin() {
        if (loggedInUser == null) {
            throw new IllegalStateException("로그인이 필요합니다.");
        }
    }

    public boolean isNotAdmin() {
        validateLogin();
        return loggedInUser.isNotAdmin();
    }
}