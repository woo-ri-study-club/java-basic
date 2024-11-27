package section13.user;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

  private static final String USER_FILE = "users.dat";

  private final Map<String, User> users;

  public UserRepositoryImpl() {
    this.users = loadUsers();
  }

  public void saveUser(User user) {
    users.put(user.getId(), user);
    writeUsers();
  }

  @Override
  public User findById(String id) {
    return users.get(id);
  }

  @Override
  public List<User> getAllUsers() {
    return new ArrayList<>(users.values());
  }

  private void writeUsers() {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(USER_FILE))) {
      outputStream.writeObject(users);
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }

  @SuppressWarnings("unchecked")
  private Map<String, User> loadUsers() {
    File file = new File(USER_FILE);
    if (!file.exists()) {
      return new HashMap<>();
    }
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
      return (Map<String, User>) inputStream.readObject();
    } catch (Exception exception) {
      exception.printStackTrace();
      return new HashMap<>();
    }
  }


}
