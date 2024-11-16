package beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    private static List<String> books = new ArrayList<>();

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
                System.out.print("책 이름을 입력해주세요: ");
                String bookName = scanner.nextLine();
                addBook(bookName);
            } else if (choice == 2) {
                viewBooks();
            } else if (choice == 3) {
                System.out.print("검색 할 책 이름을 입력해주세요: ");
                String bookName = scanner.nextLine();

                if (searchBook(bookName)) {
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

    private static void addBook(String bookName) {
        books.add(bookName);
        System.out.println("책이 등록되었습니다.");
    }

    private static void viewBooks() {
        System.out.println("도서관에 등록된 책들은 다음과 같습니다.");
        for (String book : books) {
            System.out.println(book);
        }
    }

    private static boolean searchBook(String bookName) {
        return books.contains(bookName);
    }
}
