package mission12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<User> users = new ArrayList<>();
    static List<Book> books = new ArrayList<>();

    private static void initializeBooks() {
        books.add(new Book("book1","kim","1234"));
        books.add(new Book("book2","kim","1234"));
        books.add(new Book("book3","kim","1234"));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        User admin = new AdminUser("admin", "admin", "admin");
        users.add(admin);
        initializeBooks();

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
                    System.out.print("ID : ");
                    String inputId = input.nextLine();

                    System.out.print("Password : ");
                    String inputPassword = input.nextLine();

                    System.out.print("Name : ");
                    String inputName = input.nextLine();

                    User user = new StandardUser(inputId, inputPassword, inputName);
                    users.add(user);

                    System.out.println("회원가입이 완료되었습니다.");
                    break;
                case 2:
                    System.out.println("로그인하세요");
                    System.out.print("ID : ");
                    String id = input.nextLine();
                    System.out.print("Password : ");
                    String password = input.nextLine();


                    boolean foundId = false;
                    for (User checkUser : users) {
                        if (checkUser.getId().equals(id)) {
                            foundId = true;
                            if (checkUser.checkPassword(password)) {
                                if (checkUser instanceof AdminUser) {
                                    MeunForAdmin(input,checkUser);
                                } else if (checkUser instanceof StandardUser) {
                                    MeunForCheckedUser(input, (StandardUser) checkUser);
                                }
                            } else {
                                System.out.println("비밀번호가 일치하지 않습니다.");
                            }
                            break;
                        }

                    }
                    if (!foundId) {
                        System.out.println("일치하는 id가 없습니다.");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("번호를 잘못 누르셨습니다.");
                    break;
            }
        }
    }

    private static void MeunForAdmin(Scanner input, User user) {
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
                    System.out.println("등록할 책을 입력해주세요.");
                    System.out.println("제목: ");
                    String title = input.nextLine();
                    System.out.println("저자: ");
                    String author = input.nextLine();
                    System.out.println("ISBN: ");
                    String isbn = input.nextLine();

                    Book bookToAdd = new Book(title, author, isbn);
                    books.add(bookToAdd);
                    System.out.println("책이 등록되었습니다.");
                    break;
                case 2:
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    for( User checkUser : users) {
                        if(checkUser instanceof StandardUser
                            && ((StandardUser) checkUser).hasBorrowedBook()){
                            System.out.println(checkUser);
                        }
                    }
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

    private static void MeunForCheckedUser(Scanner input, StandardUser user) {
        while (true) {
            System.out.println("로그인되었습니다.");
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
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    System.out.println("대출할 책의 제목을 입력하세요.");
                    String titleToBorrow = input.nextLine();

                    boolean bookFound = false;
                    for (Book book : books) {
                        if (book.hasSameTitle(titleToBorrow)) {
                            bookFound = true;
                            if (book.isNotBorrowed()) {
                                book.borrow();
                                book.enrollBorrowedId(user.getId());
                                user.enrollBorrowedBook(book);
                                System.out.println("책이 대출 되었습니다.");
                                break;
                            } else {
                                System.out.println("이미 대출된 책입니다.");
                            }
                        }
                    }
                    if (!bookFound) {
                        System.out.println("찾으시는 도서가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("반납할 책의 이름을 입력해주세요:");
                    String titleToReturn = input.nextLine();
                    boolean bookReturned = false;
                    for (Book book : books) {
                        if (book.hasSameTitle(titleToReturn)&& book.isBorrowed()) {
                            bookReturned = true;
                            book.isReturn();
                            user.removeBorrowedBook(book);
                            System.out.println("책이 반납 되었습니다.");
                            break;
                        }
                    }
                    if (!bookReturned) {
                        System.out.println("반납할 책이 아닙니다.");
                    }
                    break;

                case 4:
                    boolean bookBorrowed = false;
                    for (Book book : books) {
                        if (book.isBorrowedBy(user.getId())) {
                            bookBorrowed = true;
                            System.out.println(book);
                        }
                    }
                    if (!bookBorrowed) {
                        System.out.println("대출한 책이 없습니다.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("번호를 잘못 누르셨습니다.");
            }
        }
    }
}
