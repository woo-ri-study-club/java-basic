package mission12;

import mission12.service.LibraryService;
import mission12.service.UserService;
import mission12.view.MenuView;

public class Main {

    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        UserService userService = new UserService();
        MenuView view = new MenuView(libraryService, userService);
        view.showMainView();
    }
}
