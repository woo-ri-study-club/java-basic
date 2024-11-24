package mission12;

import java.util.List;
import java.util.Map;

public class Library {
    private final String systemPassword;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    private final BorrowingService borrowingService;
    private User loggedInUser;

    public Library(String systemPassword) {
        this.systemPassword = systemPassword;
        this.bookRepository = new BookRepository();
        this.userRepository = new UserRepository();
        this.borrowingService = new BorrowingService(bookRepository);
    }

    public boolean checkSystemPassword(String password) {
        return systemPassword.equals(password);
    }

    public void register(User user) {
        userRepository.add(user);
    }

    public void login(String id, String password) {
        User user = userRepository.findById(id);
        if (!user.checkPassword(password)) {
            throw new IllegalArgumentException("패스워드를 확인해주세요.");
        }
        loggedInUser = user;
        System.out.println("로그인 성공");
    }

    public void logout() {
        validateLogin();
        System.out.println(loggedInUser.getName() + "님이 로그아웃 되었습니다.");
        loggedInUser = null;
    }

    public void addBook(Book newBook) {
        validateAdminAccess();
        bookRepository.add(newBook);
        System.out.println("도서 등록 완료.");
    }

    public void displayBooks() {
        bookRepository.findAll().forEach(System.out::println);
    }

    public void borrowBook(String isbn) {
        validateLogin();
        borrowingService.borrowBook(loggedInUser, isbn);
        System.out.println("책이 대출되었습니다: " + bookRepository.findByIsbn(isbn).getTitle());
    }

    public void returnBook(String isbn) {
        validateLogin();
        borrowingService.returnBook(loggedInUser, isbn);
        System.out.println("책이 반납되었습니다: " + bookRepository.findByIsbn(isbn).getTitle());
    }

    public void viewBorrowedBooks() {
        validateLogin();
        List<Book> borrowed = borrowingService.getBorrowedBooks(loggedInUser);
        if (borrowed.isEmpty()) {
            System.out.println("대출한 책이 없습니다.");
        } else {
            borrowed.forEach(System.out::println);
        }
    }

    public void viewBorrowingUsers() {
        validateLogin();
        validateAdminAccess();

        Map<User, List<Book>> status = borrowingService.getAllBorrowingStatus();
        System.out.println("대출 중인 회원과 책 목록:");
        status.forEach((user, books) -> {
            System.out.println("회원: " + user.getName());
            books.forEach(book -> System.out.println("  대출한 책: " + book));
        });
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    private void validateLogin() {
        if (loggedInUser == null) {
            throw new IllegalStateException("로그인이 필요합니다.");
        }
    }

    private void validateAdminAccess() {
        validateLogin();
        if (!(loggedInUser instanceof AdminUser)) {
            throw new IllegalStateException("관리자 권한이 필요합니다.");
        }
    }
}