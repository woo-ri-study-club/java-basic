package section13.user;

public interface AuthManager {

  void signUp(User user);

  User signIn(String id, String password);
}
