package mission3.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        boolean isLibraryManagerOn = true;

        while (isLibraryManagerOn) {
            System.out.println("=======도서 관리 시스템=======");
            System.out.println("1. 도서 추가 | 2. 도서 조회 | 3. 도서 검색 | 4. 프로그램 종료");
            int selectMenuNumber = SCANNER.nextInt();
            SCANNER.nextLine();

            switch (selectMenuNumber) {
                case 1:
                    addBook(books);
                    break;

                case 2:
                    readAllBooks(books);
                    break;

                case 3:
                    searchBook(books);
                    break;

                case 4:
                    isLibraryManagerOn = turnOffManager();
                    break;

                default:
                    System.out.println("잘못된 번호 선택입니다.");
                    break;
            }
        }
    }

    public static void addBook(List<String> books) {
        System.out.println("추가하실 도서명을 입력해주세요.");
        String title = inputBookTitle();

        if (books.contains(title)){
            System.out.println("이미 등록된 도서입니다.");
            return;
        }

        books.add(title);
    }

    public static void readAllBooks(List<String> books) {
        for (String book : books) {
            System.out.println("도서명: " + book);
        }
    }

    public static void searchBook(List<String> books) {
        System.out.println("검색하실 도서명을 입력해주세요.");
        String title = inputBookTitle();

        for (String book : books) {
            if (title.equalsIgnoreCase(book)) {
                System.out.println("해당 도서를 보유 중입니다.");
                return;
            }
        }
        System.out.println("검색하신 제목과 일치하는 도서가 없습니다.");
    }

    private static boolean turnOffManager() {
        System.out.println("프로그램이 종료됩니다.");
        return false;
    }

    private static String inputBookTitle() {
        return SCANNER.nextLine();
    }
}
