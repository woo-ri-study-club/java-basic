package mission12.manager;

import mission12.domain.User;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class SessionManager {
    private User currentUser;

    public void createSession(User user){
        currentUser = user;
    }

    public Optional<User> getSessionUser() {
        return Optional.ofNullable(currentUser);
    }

    public User getSessionUserOrThrow() {
        if (currentUser == null) {
            throw new IllegalStateException("세션이 만료되었습니다. 다시 로그인하세요.");
        }
        return currentUser;
    }

    public void removeSession(){
        if (nonNull(currentUser)){
            currentUser = null;
        }
    }
}
