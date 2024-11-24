package io;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    private InputHandler() {
    }

    public static String getMenuSelected() {
        return scanner.nextLine();
    }

    public static String getLoginId() {
        return scanner.nextLine();
    }

    public static String getLoginPassword() {
        return scanner.nextLine();
    }

    public static String getSignUpId() {
        return scanner.nextLine();
    }

    public static String getSignUpPassword() {
        return scanner.nextLine();
    }

    public static String getSignUpName() {
        return scanner.nextLine();
    }
}
