package section13.user;

import java.util.List;

public interface UserRepository {

  void saveUser(User user);

  User findById(String id);

  List<User> getAllUsers();
}
