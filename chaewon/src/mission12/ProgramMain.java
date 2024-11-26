package mission12;

import mission12.manager.BookManager;
import mission12.manager.UserManager;

public class ProgramMain {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem(new UserManager(), new BookManager());

        librarySystem.run();
    }
}
