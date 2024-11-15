package mission3.advanced;

import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        boolean isLibraryManagerOn = true;

        while (isLibraryManagerOn) {
            try {
                System.out.println("=======도서 관리 시스템=======");
                System.out.println("1. 도서 추가 | 2. 도서 조회 | 3. 도서 검색 | 4. 도서 삭제 | 5. 도서 대출 | 6. 프로그램 종료");
                int selectMenuNumber = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (selectMenuNumber) {
                    case 1:
                        System.out.println("추가하실 도서명과 작가, isbn을 입력해주세요.");
                        System.out.print("도서명: ");
                        String title = inputString();

                        System.out.print("작가: ");
                        String author = inputString();

                        System.out.print("ISBN: ");
                        String isbn = inputString();

                        Book newBook = new Book(title, author, isbn);

                        library.addBook(newBook);
                        break;

                    case 2:
                        List<Book> allBooks = library.readAllBooks();
                        printBookList(allBooks);
                        break;

                    case 3:
                        System.out.println("검색하실 도서명을 입력해주세요.");
                        title = inputString();

                        List<Book> foundBooks = library.searchBook(title);
                        printBookList(foundBooks);
                        break;

                    case 4:
                        System.out.println("삭제하실 도서의 도서번호(ISBN)를 입력해주세요.");
                        isbn = inputString();

                        library.deleteBook(isbn);
                        break;

                    case 5:
                        System.out.println("대출하실 도서의 ISBN을 입력하세요. (아래에 대출 가능한 목록만 출력됩니다.)");

                        List<Book> availableBooks = library.readBooksCanBeLoaned();
                        printBookList(availableBooks);

                        isbn = inputString();
                        library.loanBook(availableBooks, isbn);
                        break;

                        case 6:
                        isLibraryManagerOn = turnOffManager();
                        break;

                    default:
                        System.out.println("잘못된 번호 선택입니다.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printBookList(List<Book> allBooks) {
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }

    private static boolean turnOffManager() {
        System.out.println("프로그램이 종료됩니다.");
        return false;
    }

    private static String inputString() {
        return SCANNER.nextLine();
    }
}
