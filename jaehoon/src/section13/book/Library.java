package section13.book;

import java.util.Map;

public interface Library {

  void saveBook(Map<String, Book> book);

  void deleteBook(Book book);

  Map<String, Book> getAllBooks();

}