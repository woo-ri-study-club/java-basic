package mission12.view;

import mission12.service.LibraryService;
import mission12.service.UserService;
import mission12.user.AdminUser;
import mission12.user.StandardUser;

import java.util.Scanner;

public class MenuView{

    private final static Scanner input = new Scanner(System.in);
    private final LibraryService libraryService;
    private final UserService userService;

    public MenuView(LibraryService libraryService, UserService userService) {
        this.libraryService = libraryService;
        this.userService = userService;
    }

    public void showMainView() {
        while (true) {
            System.out.println("=== 도서 관리 시스템===");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choiceNumber = input.nextInt();
            input.nextLine();

            switch (choiceNumber) {
                case 1:
                    processSingUp();
                    break;
                case 2:
                    processLogIn();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("번호를 잘못 누르셨습니다.");
                    break;
            }
        }
    }

    public void showWhenAdminLogin(AdminUser user) {

        while (true) {
            System.out.println("=== 관리자 메뉴 ===");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("3. 대출 회원 목록 조회");
            System.out.println("4. 로그아웃");
            System.out.print("선택 : ");
            int adminChoice = input.nextInt();
            input.nextLine();

            switch (adminChoice) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    showUserBorrowed();
                    break;
                case 4:
                    System.out.println("로그아웃 합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못눌렀습니다.");
                    break;
            }
        }

    }

    public void showWhenUserLogin(StandardUser user) {
        while (true) {
            System.out.println("=== 회원 메뉴 ===");
            System.out.println("1. 책 조회");
            System.out.println("2. 책 대출");
            System.out.println("3. 책 반납");
            System.out.println("4. 대출 목록");
            System.out.println("5. 로그아웃");
            System.out.print("선택 : ");
            int userChoice = input.nextInt();
            input.nextLine();
            switch (userChoice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    processBorrowBookBy(user);
                    break;
                case 3:
                    processReturnBookBy(user);
                    break;
                case 4:
                    processShowBookBoorowedBy(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("번호를 잘못 누르셨습니다.");
            }
        }
    }


    public void showUserBorrowed() {
        userService.showUserBorrowed();
    }

    public void processShowBookBoorowedBy(StandardUser user) {
        libraryService.showBorrowedBookBy(user);
    }

    public void displayAllBooks() {
        libraryService.displayAllBooks();
    }

    public void processReturnBookBy(StandardUser user) {
        System.out.println("반납할 책의 이름을 입력해주세요:");
        String titleToReturn = input.nextLine();
        libraryService.returnBookByTitle(user, titleToReturn);
    }

    public void processBorrowBookBy(StandardUser user) {
        System.out.println("대출할 책의 제목을 입력하세요.");
        String titleToBorrow = input.nextLine();
        libraryService.borrowBookByTitle(user, titleToBorrow);
    }

    public void registerBook() {
        System.out.println("등록할 책을 입력해주세요.");
        System.out.println("제목: ");
        String title = input.nextLine();
        System.out.println("저자: ");
        String author = input.nextLine();
        System.out.println("ISBN: ");
        String isbn = input.nextLine();

        libraryService.addBook(title, author, isbn);
    }

    public void processLogIn() {
        System.out.println("로그인하세요");
        System.out.print("ID : ");
        String id = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        userService.logIn(id, password, this);
    }


    public void processSingUp() {
        System.out.print("ID : ");
        String inputId = input.nextLine();
        System.out.print("Password : ");
        String inputPassword = input.nextLine();
        System.out.print("Name : ");
        String inputName = input.nextLine();

        userService.registerUser(inputId, inputPassword, inputName);
    }

}