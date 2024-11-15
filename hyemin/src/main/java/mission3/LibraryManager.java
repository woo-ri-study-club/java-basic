package mission3;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("해리포터와 마법사의 돌");
        books.add("해리포터와 비밀의 방");
        books.add("해리포터와 불의 잔");

        System.out.println(hasBook(books, "해리포터와 비밀의 방"));
        System.out.println(hasBook(books, "볼드모트와 비밀의 방"));

        printAllBooks(books);
    }

    private static void addBook(List<String> books, String bookName) {
        books.add(bookName);
    }

    private static void printAllBooks(List<String> books){
        for (String book : books) {
            System.out.println(book);
        }
    }

    private static boolean hasBook(List<String> books, String book) {
        return books.contains(book);
    }
}
