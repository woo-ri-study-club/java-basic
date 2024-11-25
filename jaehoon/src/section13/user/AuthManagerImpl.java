package section13.user;

import static java.util.Objects.isNull;

public class AuthManagerImpl implements AuthManager {

  private final UserRepository userRepository;

  public AuthManagerImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void signUp(User user) {
    if (userRepository.findById(user.getId()) != null) {
      throw new IllegalStateException("이미 존재하는 ID입니다.");
    }
    userRepository.saveUser(user);
  }

  @Override
  public User signIn(String id, String password) {
    User user = userRepository.findById(id);
    if (isNull(user) || !user.checkPassword(password)) {
      throw new IllegalStateException("ID 또는 비밀번호가 일치하지 않습니다.");
    }
    return user;
  }
}
