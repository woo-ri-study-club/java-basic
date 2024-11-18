package mission6.advanced;

import mission6.advanced.domain.Account;
import mission6.advanced.domain.User;

public class AdvancedMain {
    public static void main(String[] args) {
        User user = new User(
                "Darimi"
                , "password1234"
        );

        Account userAccount = new Account(
                user
                , "darimi2222"
        );

        System.out.println(userAccount.displayAccount());

        user.updatePassword("new_password@");
        System.out.println(userAccount.displayAccount());
    }
}
