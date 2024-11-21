package mission08.advanced;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("소년이 온다", "한강"));
        library.addBook(new Book("눈부신 안부", "백수린"));
        library.addBook(new Book("에디토리얼 씽킹", "최혜진"));
        library.showBooks();
    }
}
