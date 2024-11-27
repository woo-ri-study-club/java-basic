package mission12;

import mission12.domain.Admin;
import mission12.domain.Book;
import mission12.domain.Member;
import mission12.domain.User;
import mission12.manager.BookManager;
import mission12.manager.UserManager;

import java.util.Scanner;

public class LibrarySystem {

    private final Scanner scanner = new Scanner(System.in);
    private final UserManager userManager;
    private final BookManager bookManager;
    private boolean isProgress = true;

    public LibrarySystem(UserManager userManager, BookManager bookManager) {
        this.userManager = userManager;
        this.bookManager = bookManager;
    }

    public void run() {
        try {
            while (isProgress) {
                if (userManager.hasActiveSession()) {
                    User currentUser = userManager.getCurrentSessionUser();

                    if (currentUser instanceof Member member) {
                        showMemberMenu();
                        handleMemberMenu(member);
                    } else if (currentUser instanceof Admin) {
                        showAdminMenu();
                        handleAdminMenu();
                    } else {
                        throw new IllegalArgumentException("알 수 없는 사용자입니다.");
                    }
                } else {
                    showInitialMenu();
                    handleInitialMenu();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleInitialMenu() {
        switch (selectMenuNumber()) {
            case 1:
                signUp();
                break;
            case 2:
                signIn();
                break;
            case 3:
                turnOffProgram();
                break;
            default:
                throw new IllegalArgumentException("올바른 번호 선택이 아닙니다.");
        }
    }

    private void handleAdminMenu() {
        switch (selectMenuNumber()) {
            case 1:
                registerBook();
                break;
            case 2:
                bookManager.displayAllBooks();
                break;
            case 3:
                bookManager.displayBorrowedBooks();
                break;
            case 4:
                userManager.logoutUser();
                break;
            default:
                throw new IllegalArgumentException("올바른 번호 선택이 아닙니다.");
        }
    }

    private void handleMemberMenu(Member loginMember) {
        switch (selectMenuNumber()) {
            case 1:
                bookManager.displayAllBooks();
                break;
            case 2:
                borrowBook(loginMember);
                break;
            case 3:
                returnBook(loginMember);
                break;
            case 4:
                userManager.displayBorrowedBooks(loginMember);
                break;
            case 5:
                userManager.logoutUser();
                break;
            default:
                throw new IllegalArgumentException("올바른 번호 선택이 아닙니다.");
        }
    }


    private void showInitialMenu() {
        System.out.println("======= 도서 관리 시스템 =======");
        System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
    }

    private void signUp() {
        System.out.println("======= 회원가입 =======");

        System.out.print("성함: ");
        String userName = scanner.nextLine();
        System.out.print("ID: ");
        String userId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        User user = new Member(userName, userId, password);
        userManager.addUser(user);
    }

    private void signIn() {
        System.out.println("======= 로그인 =======");

        System.out.print("ID: ");
        String userId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        userManager.loginUser(userId, password);
    }

    private void showMemberMenu() {
        System.out.println("======= 회원 메뉴 =======");
        System.out.println("1. 도서 조회 | 2. 도서 대출 | 3. 도서 반납 | 4. 대출 목록 조회 | 5. 로그아웃");
    }

    private void returnBook(Member loginMember) {
        System.out.println("반납할 도서의 ISBN을 입력하세요.");
        String isbn = scanner.nextLine();

        bookManager.returnBook(loginMember, isbn);
    }

    private void borrowBook(Member loginMember) {
        System.out.println("대출할 도서의 ISBN을 입력하세요.");
        String isbn = scanner.nextLine();

        bookManager.borrowBook(loginMember, isbn);
    }

    private void showAdminMenu() {
        System.out.println("======= 관리자 메뉴 =======");
        System.out.println("1. 도서 등록 | 2. 도서 조회 | 3. 대출 회원 목록 조회 | 4. 로그아웃");
    }

    private void registerBook() {
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("작가명: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        Book book = new Book(title, author, isbn);

        bookManager.addBook(book);
    }

    private int selectMenuNumber() {
        System.out.print("선택: ");
        int selectNumber = scanner.nextInt();
        scanner.nextLine();

        return selectNumber;
    }

    private void turnOffProgram() {
        System.out.println("프로그램을 종료합니다.");
        isProgress = false;
    }
}

