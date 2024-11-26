package mission12.manager;

import mission12.domain.Admin;
import mission12.domain.Book;
import mission12.domain.Member;
import mission12.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

public class UserManager {
    private static final String ADMIN_ID = System.getenv("ADMIN_ID");
    private static final String ADMIN_PASSWORD = System.getenv("ADMIN_PASSWORD");

    private final Map<String, User> userRepository = new HashMap<>();
    private final SessionManager sessionManager = new SessionManager();

    public void addUser(User user) {
        if (isNull(user)) {
            throw new IllegalArgumentException("User는 null일 수 없습니다.");
        }

        userRepository.put(user.getUserId(), user);
    }

    public User loginUser(String userId, String password) {
        if (userId.equals(ADMIN_ID) && password.equals(ADMIN_PASSWORD)) {
            User user = new Admin("관리자", userId, password);

            sessionManager.createSession(user);
            System.out.println(user.getUserId() + "님 환영합니다.");
            return user;
        }

        User user = userRepository.get(userId);

        if (isNull(user)) {
            throw new IllegalArgumentException("아이디 혹은 비밀번호가 잘못되었습니다.");
        }

        if (user.isNotSamePassword(password)) {
            throw new IllegalArgumentException("아이디 혹은 비밀번호가 잘못되었습니다.");
        }

        sessionManager.createSession(user);
        System.out.println(user.getUserId() + "님 환영합니다.");
        return user;
    }

    public void displayBorrowedBooks(Member member) {
        List<Book> borrowedBooks = member.getBorrowedBooks();

        if (borrowedBooks.isEmpty()) {
            System.out.println("대출한 도서가 존재하지 않습니다.");
            return;
        }

        borrowedBooks.forEach(System.out::println);
    }

    public void logoutUser() {
        sessionManager.removeSession();
    }

}
