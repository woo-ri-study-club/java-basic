package mission12.manager;

import mission12.domain.User;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class SessionManager {
    private User currentUser = null;

    public void createSession(User user){
        currentUser = user;
    }

    public User getSessionUser(String sessionId){

        if (isNull(currentUser)){
            throw new IllegalArgumentException("만료된 세션 혹은 존재하지 않는 세션입니다.");
        }

        return currentUser;
    }

    public void removeSession(){
        if (nonNull(currentUser)){
            currentUser = null;
        }
    }
}
