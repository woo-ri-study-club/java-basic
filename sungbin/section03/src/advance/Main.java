package advance;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(3);

        library.showBookTitle(1);
        library.showBookTitle(2);
        library.showBookTitle(3);

        library.expandCapacity(5);

        library.add(new Book("Java", "park"));
        library.add(new Book("Kotlin", "choi"));

        library.showBookTitle(4);
        library.showBookTitle(5);

        library.expandCapacity(6);

        library.add(new Book("Python", "kim"));
        library.showBookTitle(6);
    }
}
