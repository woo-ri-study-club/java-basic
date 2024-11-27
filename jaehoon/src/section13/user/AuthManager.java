package section13.user;

public interface AuthManager {

  void signUp(String id, String name, String password, boolean isAdmin);

  User signIn(String id, String password);
}
