package section13;

import section13.book.*;
import section13.user.*;

import java.util.Map;
import java.util.Scanner;

import static java.util.Objects.isNull;

public class LibrarySystem {

  public static User sessionUser;

  public static LibraryManager libraryManager;

  public static AuthManager authManager = new AuthManagerImpl(new UserRepositoryImpl());

  public static void main(String[] args) {
    createDummyAdmin();
    createDummyBooks();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      if (isNull(sessionUser)) {
        Menu.showMainMenu();
        processMainMenu(scanner);
        continue;
      }

      if (sessionUser.isAdmin()) {
        Menu.showAdminMenu();
        processAdminMenu(scanner);
        continue;
      }

      if (!sessionUser.isAdmin()) {
        Menu.showUserMenu();
        processUserMenu(scanner);
        continue;
      }
    }
  }

  private static void processMainMenu(Scanner scanner) {
    try {
      int choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
        case 1 -> {
          // 회원가입
          System.out.print("회원가입할 ID를 입력하세요: ");
          String id = scanner.nextLine();
          System.out.print("회원가입할 이름 입력하세요: ");
          String name = scanner.nextLine();
          System.out.print("사용할 비밀번호를 입력하세요: ");
          String password = scanner.nextLine();

          User newUser = new User(id, name, password, false);
          authManager.signUp(newUser);

        }
        case 2 -> {
          // 로그인
          System.out.print("ID를 입력하세요: ");
          String id = scanner.nextLine();
          System.out.print("패스워드를 입력하세요: ");
          String password = scanner.nextLine();

          sessionUser = authManager.signIn(id, password);
          settingLibraryManager();
          if (!sessionUser.isAdmin()) {
            sessionUser.setBorrowedBooks(libraryManager.getBorrowedBooksByUserId(id));
          }
        }
        case 3 -> {
          // 종료
          System.out.println("프로그램 종료.");
          System.exit(0);
        }
        default -> {
          System.out.println("잘못된 선택입니다.");
        }
      }
    } catch (NumberFormatException numberFormatException) {
      System.out.println("숫자를 입력해주세요.");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  private static void processUserMenu(Scanner scanner) {
    try {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1 -> {
          // 등록된 모든 책조회
          libraryManager.viewAllBooks();
        }
        case 2 -> {
          // 책 대출
          System.out.print("대출할 책의 isbn을 입력하세요:");
          String isbn = scanner.nextLine();
          libraryManager.checkedOutBook(sessionUser, isbn);
        }
        case 3 -> {
          // 책 반납
          System.out.print("반납할 책의 isbn을 입력하세요:");
          String isbn = scanner.nextLine();
          libraryManager.returnBook(sessionUser, isbn);
        }
        case 4 -> libraryManager.viewBorrowedBooks(sessionUser); // 대출 목록 조회
        case 5 -> {
          // 로그아웃
          sessionUser = null;
          libraryManager = null;
        }
        default -> System.out.println("잘못된 선택입니다.");
      }
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  private static void processAdminMenu(Scanner scanner) {
    try {
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> {
          // 책등록
          System.out.print("등록할 책 제목을 입력하세요: ");
          String title = scanner.nextLine();

          System.out.print("등록할 책의 저자를 입력하세요: ");
          String author = scanner.nextLine();

          System.out.print("등록할 책의 isbn을 입력하세요: ");
          String isbn = scanner.nextLine();
          Book newBook = new Book(isbn, title, author);
          libraryManager.addBook(newBook);
          System.out.println("등록이 완료되었습니다: " + newBook);
        }
        case 2 -> {
          // 등록된 모든 책조회
          libraryManager.viewAllBooks();
        }
        case 3 -> {
          // 대출 회원 목록 조회
          libraryManager.viewBorrowedUserIds();

        }
        case 4 -> {
          // 로그아웃
          sessionUser = null;
          libraryManager = null;
        }
        default -> System.out.println("잘못된 선택입니다.");
      }
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  private static void settingLibraryManager() {
    if (sessionUser.isAdmin()) {
      libraryManager = new AdminLibraryManager(new FileLibrary());
    } else {
      libraryManager = new UserLibraryManager(new FileLibrary());
    }
  }

  private static void createDummyAdmin() {
    try {
      UserRepository userRepository = new UserRepositoryImpl();
      User admin = new User("admin", "관리자", "admin", true);
      userRepository.saveUser(admin);
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  private static void createDummyBooks() {
    FileLibrary fileLibrary = new FileLibrary();
    LibraryManager libraryManager = new AdminLibraryManager(fileLibrary);
    try {
      libraryManager.searchByIsbn("1111");
    } catch (IllegalArgumentException illegalArgumentException) {
      Map<String, Book> map = Map.of(
          "1111", new Book("1111", "헤드퍼스트디자인패턴", "에릭프리먼"),
          "2222", new Book("2222", "객체지향의사실과오해", "조영호"),
          "3333", new Book("3333", "오브젝트", "조영호"),
          "4444", new Book("4444", "이펙티브자바", "조슈아블로크"),
          "5555", new Book("5555", "도메인주도개발시작하기", "최범균")
      );
      fileLibrary.saveBook(map);
    }

  }
}
