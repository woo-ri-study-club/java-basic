package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 책 추가");
            System.out.println("2. 책 리스트 확인");
            System.out.println("3. 책 검색");
            System.out.println("4. 종료");
            System.out.print("옵션을 선택해주세요.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("책 제목을 입력해주세요: ");
                String title = scanner.nextLine();

                System.out.print("책 작가를 입력해주세요: ");
                String author = scanner.nextLine();

                System.out.print("책 일련번호를 입력해주세요: ");
                String isbn = scanner.nextLine();
                books.add(new Book(title, author, isbn));
                System.out.println("책이 등록되었습니다.");
            } else if (choice == 2) {
                viewBooks();
            } else if (choice == 3) {
                System.out.print("검색 할 책 이름을 입력해주세요: ");
                String title = scanner.nextLine();

                if (searchBook(title)) {
                    System.out.println("책을 찾았습니다.");
                } else {
                    System.out.println("책을 찾지 못했습니다.");
                }
            } else if (choice == 4) {
                break;
            }
        }

        scanner.close();
    }

    private static void viewBooks() {
        System.out.println("도서관에 등록된 책들은 다음과 같습니다.");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static boolean searchBook(String bookName) {
        return books.stream().anyMatch(book -> book.getTitle().equalsIgnoreCase(bookName));
    }
}
