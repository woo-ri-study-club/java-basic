package mission12;

import mission12.controller.MenuController;
import mission12.service.LibraryService;
import mission12.service.UserService;
import mission12.view.MenuView;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController(
                new LibraryService(), new UserService());

        MenuView view = new MenuView(menuController);
        view.showMainView();
    }
}
