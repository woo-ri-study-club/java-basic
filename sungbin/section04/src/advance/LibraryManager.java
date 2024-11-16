package advance;

import java.util.Scanner;

public class LibraryManager {

    private static final Library LIBRARY = new Library();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 책 추가");
            System.out.println("2. 책 리스트 확인");
            System.out.println("3. 제목을 통한 책 검색");
            System.out.println("4. 책 대출");
            System.out.println("5. 책 반납");
            System.out.println("6. 종료");
            System.out.print("옵션을 선택해주세요.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> viewAllBooks();
                case 3 -> searchBookByTitle(scanner);
                case 4 -> checkoutBook(scanner);
                case 5 -> returnBook(scanner);
                case 6 -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("유효하지 않은 선택값입니다.");
            }
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.print("제목을 입력해주세요: ");
        String title = scanner.nextLine();

        System.out.print("작가를 입력해주세요: ");
        String author = scanner.nextLine();

        System.out.print("일련번호를 입력해주세요: ");
        String isbn = scanner.nextLine();

        if (LIBRARY.addBook(title, author, isbn)) {
            System.out.println("Book added.");
        }
    }

    private static void viewAllBooks() {
        System.out.println("### 책 리스트 ###");
        LIBRARY.getBooks().forEach(System.out::println);
    }

    private static void searchBookByTitle(Scanner scanner) {
        System.out.print("책 제목을 입력해주세요: ");
        String title = scanner.nextLine();
        LIBRARY.searchByTitle(title)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("책을 찾을 수 없습니다.")
                );
    }

    private static void checkoutBook(Scanner scanner) {
        System.out.print("대출 할 책 일련번호를 입력해주세요: ");
        String isbn = scanner.nextLine();
        LIBRARY.checkOutBook(isbn);
    }

    private static void returnBook(Scanner scanner) {
        System.out.print("반납 할 책 일련번호를 입력해주세요: ");
        String isbn = scanner.nextLine();
        LIBRARY.returnBook(isbn);
    }
}
