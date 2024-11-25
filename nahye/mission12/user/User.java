package mission12.user;

import mission12.view.MenuView;

public interface User {

    String getId();

    String getName();

    boolean hasUserById(String id);


    boolean checkPassword(String password);

    void showMenuView(MenuView view);

}
