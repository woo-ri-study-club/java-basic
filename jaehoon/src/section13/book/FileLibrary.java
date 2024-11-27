package section13.book;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileLibrary implements Library {

  private static final String BOOK_FILE = "books.dat";

  @Override
  public void saveBook(Map<String, Book> books) {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(BOOK_FILE))) {
      outputStream.writeObject(books);
    } catch (IOException ioException) {
      System.out.println("error message: " + ioException.getMessage());
    }
  }

  @Override
  public void deleteBook(Book book) {
    Map<String, Book> books = getAllBooks();
    if (books.containsKey(book.getIsbn())) {
      books.remove(book.getIsbn());
      saveBook(books);
    } else {
      throw new IllegalArgumentException("해당 ISBN의 책을 찾을 수 없습니다: " + book.getIsbn());
    }
  }

  @Override
  public Map<String, Book> getAllBooks() {
    return loadBooks();
  }

  @SuppressWarnings("unchecked")
  private Map<String, Book> loadBooks() {
    File file = new File(BOOK_FILE);
    if (!file.exists()) {
      return new HashMap<>();
    }
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
      return new HashMap<>((Map<String, Book>) inputStream.readObject());
    } catch (Exception exception) {
      exception.printStackTrace();
      return new HashMap<>();
    }
  }
}
