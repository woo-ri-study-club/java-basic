package mission12;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library("123");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayGuide();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    registerUser(library, scanner);
                    break;
                case 2:
                    loginUser(library, scanner);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 옵션입니다. 다시 입력해주세요.");
            }
        }
    }

    public static void displayGuide() {
        System.out.println("===도서 관리 시스템===");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.print("선택: ");
    }

    private static void registerUser(Library library, Scanner scanner) {
        User user = createUser(scanner);

        if (user instanceof AdminUser) {
            if (!promptForAdminPassword(library, scanner)) {
                System.out.println("관리자 회원가입에 실패했습니다.");
                return;
            }
        }

        try {
            library.register(user);
            System.out.println(user instanceof AdminUser ? "관리자로 회원가입 완료." : "일반 회원으로 가입 완료.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static User createUser(Scanner scanner) {
        String name = promptForInput(scanner, "이름: ");
        String id = promptForInput(scanner, "ID: ");
        String password = promptForInput(scanner, "비밀번호: ");

        return createUserBasedOnRole(scanner, name, id, password);
    }

    private static String promptForInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static User createUserBasedOnRole(Scanner scanner, String name, String id, String password) {
        System.out.print("관리자이면 O를 입력하세요: ");
        String isAdmin = scanner.nextLine();

        if (isAdmin.equalsIgnoreCase("O")) {
            System.out.println("관리자로 회원가입합니다.");
            return new AdminUser(name, id, password);
        } else {
            System.out.println("일반 회원으로 가입합니다.");
            return new RegularUser(name, id, password);
        }
    }

    private static boolean promptForAdminPassword(Library library, Scanner scanner) {
        System.out.print("시스템 비밀번호 입력: ");
        String systemPassword = scanner.nextLine();
        return library.checkSystemPassword(systemPassword);
    }

    private static void loginUser(Library library, Scanner scanner) {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        try {
            library.login(id, password);
            User loggedInUser = library.getLoggedInUser();
            userMenu(library, scanner, loggedInUser);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void userMenu(Library library, Scanner scanner, User loggedInUser) {
        while (loggedInUser != null) {
            displayMenu(loggedInUser);
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                if (loggedInUser.isAdmin()) {
                    loggedInUser = handleAdminChoice(choice, library, scanner);
                } else {
                    loggedInUser = handleUserChoice(choice, library, scanner);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            loggedInUser = library.getLoggedInUser();
        }
    }

    private static void displayMenu(User user) {
        if (user.isAdmin()) {
            System.out.println("\n=== 관리자 메뉴 ===");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("3. 대출 회원 목록 조회");
            System.out.println("4. 로그아웃");
            System.out.print("선택: ");
        } else {
            System.out.println("\n=== 회원 메뉴 ===");
            System.out.println("1. 책 조회");
            System.out.println("2. 책 대출");
            System.out.println("3. 책 반납");
            System.out.println("4. 대출 목록 조회");
            System.out.println("5. 로그아웃");
            System.out.print("선택: ");
        }
    }

    private static User handleAdminChoice(int choice, Library library, Scanner scanner) {
        switch (choice) {
            case 1:
                addBook(library, scanner);
                break;
            case 2:
                library.displayBooks();
                break;
            case 3:
                library.viewBorrowingUsers();
                break;
            case 4:
                library.logout();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
        return library.getLoggedInUser();
    }

    private static User handleUserChoice(int choice, Library library, Scanner scanner) {
        switch (choice) {
            case 1:
                library.displayBooks();
                break;
            case 2:
                borrowBook(library, scanner);
                break;
            case 3:
                returnBook(library, scanner);
                break;
            case 4:
                library.viewBorrowedBooks();
                break;
            case 5:
                library.logout();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
        return library.getLoggedInUser();
    }

    private static void borrowBook(Library library, Scanner scanner) {
        System.out.print("대출할 ISBN: ");
        String borrowIsbn = scanner.nextLine();
        library.borrowBook(borrowIsbn);
    }

    private static void returnBook(Library library, Scanner scanner) {
        System.out.print("반납할 ISBN: ");
        String returnIsbn = scanner.nextLine();
        library.returnBook(returnIsbn);
    }

    private static void addBook(Library library, Scanner scanner) {
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        library.addBook(new Book(title, author, isbn));
    }
}
