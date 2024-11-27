package mission12;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void add(User user) {
        if(user == null) throw new IllegalArgumentException("User는 null일 수 없습니다.");
        users.add(user);
    }

    public User findById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("ID에 해당하는 사용자가 없습니다."));
    }
}
