package mission12.controller;

import mission12.book.Book;
import mission12.service.LibraryService;
import mission12.service.UserService;
import mission12.user.AdminUser;
import mission12.user.StandardUser;
import mission12.user.User;
import mission12.user.UserState;

import java.util.Scanner;

import static mission12.view.MenuView.*;

public class MenuController {

    private final Scanner input = new Scanner(System.in);
    private final LibraryService libraryService;
    private final UserService userService;
    private UserState userState = UserState.MAIN;
    private User currentUser;

    public MenuController(LibraryService libraryService, UserService userService) {
        this.libraryService = libraryService;
        this.userService = userService;
    }

    public void run() {
        while (userState != UserState.EXIT) {
            switch (userState) {
                case MAIN:
                    showMainMenu();
                    break;
                case ADMIN:
                    showAdminMenu();
                    break;
                case STANDARD:
                    showUserMenu();
                    break;
            }
        }
    }

    public void showMainMenu() {
        showMainView();

        int choiceNumber = input.nextInt();
        input.nextLine();

        switch (choiceNumber) {
            case 1:
                showMeunForSingUp();
                break;
            case 2:
                showMenuForLogIn();
                break;
            case 3:
                System.out.println("종료합니다.");
                userState = UserState.EXIT;
                break;
            default:
                System.out.println("번호를 잘못 누르셨습니다.");
                break;
        }
    }

    public void showAdminMenu() {
        showWhenAdminLogin();

        int adminChoice = input.nextInt();
        input.nextLine();

        switch (adminChoice) {
            case 1:
                showMenuForRegisterBook();
                break;
            case 2:
                displayAllBooks();
                break;
            case 3:
                showUserBorrowed();
                break;
            case 4:
                System.out.println("로그아웃 합니다.");
                userState = UserState.MAIN;
                break;
            default:
                System.out.println("번호를 잘못눌렀습니다.");
                break;
        }
    }

    public void showUserMenu() {
        showWhenUserLogin();

        StandardUser user = (StandardUser) currentUser;
        int userChoice = input.nextInt();
        input.nextLine();
        switch (userChoice) {
            case 1:
                displayAllBooks();
                break;
            case 2:
                showMenuForBorrowBookBy(user);
                break;
            case 3:
                showMenuForReturnBookBy(user);
                break;
            case 4:
                processShowBookBoorowedBy(user);
                break;
            case 5:
                System.out.println("로그아웃 합니다.");
                userState = UserState.MAIN;
                break;
            default:
                System.out.println("번호를 잘못 누르셨습니다.");
        }
    }

    public void showMenuForLogIn() {
        System.out.println("로그인하세요");
        System.out.print("ID : ");
        String id = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        User user = userService.logIn(id, password);
        if (user != null) {
            currentUser = user;
            userState = (user instanceof AdminUser) ? UserState.ADMIN : UserState.STANDARD;
        }
    }

    public void showMeunForSingUp() {
        System.out.print("ID : ");
        String inputId = input.nextLine();
        System.out.print("Password : ");
        String inputPassword = input.nextLine();
        System.out.print("Name : ");
        String inputName = input.nextLine();

        userService.registerUser(new StandardUser(inputId, inputPassword, inputName));
    }

    public void showMenuForRegisterBook() {
        System.out.println("등록할 책을 입력해주세요.");
        System.out.println("제목: ");
        String title = input.nextLine();
        System.out.println("저자: ");
        String author = input.nextLine();
        System.out.println("ISBN: ");
        String isbn = input.nextLine();

        libraryService.addBook(new Book(title, author, isbn));
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

    public void showMenuForReturnBookBy(StandardUser user) {
        System.out.println("반납할 책의 이름을 입력해주세요:");
        String titleToReturn = input.nextLine();
        libraryService.returnBookByTitle(user, titleToReturn);
    }

    public void showMenuForBorrowBookBy(StandardUser user) {
        System.out.println("대출할 책의 제목을 입력하세요.");
        String titleToBorrow = input.nextLine();
        libraryService.borrowBookByTitle(user, titleToBorrow);
    }

}
