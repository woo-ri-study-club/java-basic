package section13.user;

import static java.util.Objects.isNull;

public class AuthManagerImpl implements AuthManager {

  private final UserRepository userRepository;

  public AuthManagerImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void signUp(String id, String name, String password, boolean isAdmin) {
    if (userRepository.findById(id) != null) {
      throw new IllegalStateException("이미 존재하는 ID입니다.");
    }
    User newUser = new User(id, name, password, isAdmin);
    userRepository.saveUser(newUser);
    System.out.println("#### 회원가입이 완료되었습니다.: " + newUser);
  }

  @Override
  public User signIn(String id, String password) {
    User user = userRepository.findById(id);
    if (isNull(user) || !user.checkPassword(password)) {
      throw new IllegalStateException("ID 또는 비밀번호가 일치하지 않습니다.");
    }
    System.out.println("#### 로그인이 완료되었습니다. 환영합니다. " + user.getName() + "님");
    return user;
  }
}
