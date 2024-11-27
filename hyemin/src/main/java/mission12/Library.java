package mission12;

import java.util.List;
import java.util.Map;

public class Library {
    private final String systemPassword;
    private final BookRepository bookRepository;
    private final AuthService authService;
    private final BorrowingService borrowingService;

    public Library(String systemPassword) {
        this.systemPassword = systemPassword;
        this.bookRepository = new BookRepository();
        this.authService = new AuthService();
        this.borrowingService = new BorrowingService(bookRepository);
    }

    public boolean checkSystemPassword(String password) {
        return systemPassword.equals(password);
    }

    public void register(User user) {
        authService.getUserRepository().add(user);
    }

    public void login(String id, String password) {
        authService.login(id, password);
    }

    public void logout() {
        authService.logout();
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
        authService.validateLogin();
        borrowingService.borrowBook(authService.getLoggedInUser(), isbn);
        System.out.println("책이 대출되었습니다: " + bookRepository.findByIsbn(isbn).getTitle());
    }

    public void returnBook(String isbn) {
        authService.validateLogin();
        borrowingService.returnBook(authService.getLoggedInUser(), isbn);
        System.out.println("책이 반납되었습니다: " + bookRepository.findByIsbn(isbn).getTitle());
    }

    public void viewBorrowedBooks() {
        authService.validateLogin();
        List<Book> borrowed = borrowingService.getBorrowedBooks(authService.getLoggedInUser());
        if (borrowed.isEmpty()) {
            System.out.println("대출한 책이 없습니다.");
        } else {
            borrowed.forEach(System.out::println);
        }
    }

    public void viewBorrowingUsers() {
        authService.validateLogin();
        validateAdminAccess();

        Map<User, List<Book>> status = borrowingService.getAllBorrowingStatus();
        System.out.println("대출 중인 회원과 책 목록:");
        status.forEach((user, books) -> {
            System.out.println("회원: " + user.getName());
            books.forEach(book -> System.out.println("  대출한 책: " + book));
        });
    }

    public User getLoggedInUser() {
        return authService.getLoggedInUser();
    }

    private void validateAdminAccess() {
        if (authService.isNotAdmin()) {
            throw new IllegalStateException("관리자 권한이 필요합니다.");
        }
    }
}