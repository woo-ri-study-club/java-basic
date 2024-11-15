package mission3.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        boolean isLibraryManagerOn = true;

        while (isLibraryManagerOn) {
            System.out.println("=======도서 관리 시스템=======");
            System.out.println("1. 도서 추가 | 2. 도서 조회 | 3. 도서 검색 | 4. 도서 삭제 | 5. 프로그램 종료");
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
                    deleteBook(books);
                    break;

                case 5:
                    isLibraryManagerOn = turnOffManager();
                    break;

                default:
                    System.out.println("잘못된 번호 선택입니다.");
                    break;
            }
        }
    }

    public static void addBook(List<Book> books) {
        System.out.println("추가하실 도서명과 작가, isbn을 입력해주세요.");
        System.out.print("도서명: ");
        String title = inputString();

        System.out.print("작가: ");
        String author = inputString();

        System.out.print("ISBN: ");
        String isbn = inputString();

        Book newBook = Book.createBook(title, author, isbn);

        for (Book book : books) {
            if (newBook.equals(book)) {
                System.out.println("이미 추가된 도서입니다.");
                return;
            }
        }

        if (newBook != null){
            books.add(newBook);
        }
    }

    public static void readAllBooks(List<Book> books) {
        if(books.isEmpty()){
            System.out.println("도서 목록이 비어있습니다.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void searchBook(List<Book> books) {
        System.out.println("검색하실 도서명을 입력해주세요.");
        String title = inputString();

        boolean isBookFound = false;
        for (Book book : books) {
            if (book.isTitleContaining(title)) {
                System.out.println(book);
                isBookFound = true;
            }
        }

        if (!isBookFound){
            System.out.println("검색하신 키워드를 포함하는 도서가 없습니다.");
        }
    }

    public static void deleteBook(List<Book> books) {
        System.out.println("삭제하실 도서의 도서번호(ISBN)를 입력해주세요.");
        String isbn = inputString();

        books.removeIf(book -> book.isSameIsbn(isbn));
    }

    private static boolean turnOffManager() {
        System.out.println("프로그램이 종료됩니다.");
        return false;
    }

    private static String inputString() {
        return SCANNER.nextLine();
    }
}
