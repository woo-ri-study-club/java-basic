package seuem.mission2.advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("--------도서관----------");
            System.out.println("1- 책을 추가하기 원하시면 1을 입력해주세요. ");
            System.out.println("2- 책 목록을 보려면 2을 입력해주세요. ");
            System.out.println("3- 종료를 원하시면 3을 입력해주세요.");
            Scanner scanner = new Scanner(System.in);
            int num= scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                System.out.println("몇개의 책을 추가하시나요?");

                int numOfBooks= scanner.nextInt();
                scanner.nextLine();
                if (numOfBooks < 1) {
                    System.out.println("입력하실수없는 값입니다.");
                    continue;
                }

                for (int i = 1; i <=numOfBooks ; i++) {
                    System.out.println(i+"번째 책의 제목을 입력하세요.");
                    String name= scanner.nextLine();
                    System.out.println("저자를 입력하세요.");
                    String author = scanner.nextLine();
                    books.add(save(name, author));
                    System.out.println(i+ "번째 책이 등록되었습니다.");
                }

                continue;
            }
            if (num == 2) {
                list(books);
                int chosenBookTitle = scanner.nextInt();
                if (chosenBookTitle <= 0 || chosenBookTitle > books.size()) {
                    System.out.println("입력할수 없는 입력입니다.");
                    continue;
                }
                bookDetail(books,chosenBookTitle);
                continue;
            }
            if (num == 3) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
        }



    }
    static Book save(String name, String author){
        Book book = new Book();
        book.name = name;
        book.author = author;
        book.createdDate = LocalDateTime.now();
        return book;
    }

    static void list(ArrayList<Book> books) {
        System.out.println("검색을 원하시는 책의 번호를 입력해주세요. ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i+1+"- " + books.get(i).name);
        }
    }
    static void bookDetail(ArrayList<Book> books,int chosenBookTitle) {
        int index=chosenBookTitle-1;
        System.out.println("선택하신 책의 정보입니다.");
        System.out.println("제목: "+books.get(chosenBookTitle-index).name);
        System.out.println("저자: "+books.get(chosenBookTitle-index).author);
        System.out.println("등록일자: "+books.get(chosenBookTitle-index).createdDate);
    }
}
