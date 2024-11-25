package mission12.controller;

import mission12.book.Book;
import mission12.service.LibraryService;
import mission12.service.UserService;
import mission12.user.StandardUser;
import mission12.view.MenuView;

import java.util.Scanner;

public class MenuController {

    private final Scanner input = new Scanner(System.in);
    private final LibraryService libraryService;
    private final UserService userService;

    public MenuController(LibraryService libraryService, UserService userService) {
        this.libraryService = libraryService;
        this.userService = userService;
    }

    public boolean showMainMenuByChoice() {
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
                System.out.println("종료합니다.");
                return true;
            default:
                System.out.println("번호를 잘못 누르셨습니다.");
                break;
        }
        return false;
    }

    public boolean showAdminMenuByChoice() {
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
                return true;
            default:
                System.out.println("번호를 잘못눌렀습니다.");
                break;
        }
        return false;
    }

    public boolean showUserMenuByChoice(StandardUser user) {
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
                return true;
            default:
                System.out.println("번호를 잘못 누르셨습니다.");
        }
        return false;
    }

    public void processLogIn() {
        System.out.println("로그인하세요");
        System.out.print("ID : ");
        String id = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        userService.logIn(id, password, new MenuView(this));
    }


    public void processSingUp() {
        System.out.print("ID : ");
        String inputId = input.nextLine();
        System.out.print("Password : ");
        String inputPassword = input.nextLine();
        System.out.print("Name : ");
        String inputName = input.nextLine();

        userService.registerUser(new StandardUser(inputId, inputPassword, inputName));
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

        libraryService.addBook(new Book(title, author, isbn));
    }

}
