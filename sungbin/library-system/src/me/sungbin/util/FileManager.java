package me.sungbin.util;

import me.sungbin.book.Book;
import me.sungbin.book.BookManager;
import me.sungbin.user.User;
import me.sungbin.user.UserManager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileManager {

    private static final String USERS_FILE = "users.dat";

    private static final String BOOKS_FILE = "books.dat";

    public void saveData(UserManager userManager, BookManager bookManager) {
        saveToFile(USERS_FILE, userManager.getUsers());
        saveToFile(BOOKS_FILE, bookManager.getBooks());

        System.out.println("데이터가 저장되었습니다.");
    }

    public void loadData(UserManager userManager, BookManager bookManager) {
        userManager.getUsers().putAll((Map<String, User>) loadFromFile(USERS_FILE, new HashMap<>()));
        bookManager.getBooks().addAll((List<Book>) loadFromFile(BOOKS_FILE, new ArrayList<>()));
        System.out.println("데이터가 로드되었습니다.");
    }

    private void saveToFile(String fileName, Object data) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            System.out.println("데이터 저장 중 오류 발생: " + e.getMessage());
        }
    }

    private Object loadFromFile(String fileName, Object defaultData) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return defaultData;
        }
    }
}
