package com.library.users;

import com.library.books.Book;

import java.util.ArrayList;
import java.util.List;

public class User {

  private String name;

  private List<Book> borrowedBooks;

  public User(String name) {
    this.name = name;
    this.borrowedBooks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void borrowBook(Book book) {
    if (book.isCheckedOut()) {
      System.out.println("도서 '" + book.getTitle() + "' 은(는) 이미 대출된 도서입니다.");
    } else {
      book.checkout();
      borrowedBooks.add(book);
      System.out.println("도서 '" + book.getTitle() + "' 을(를) 대출합니다.");
    }
  }

  public void returnBook(Book book) {
    if (!borrowedBooks.contains(book)) {
      System.out.println("도서 '" + book.getTitle() + "' 은(는) 대출한 책이 아닙니다.");
    } else {
      book.returnBook();
      borrowedBooks.remove(book);
      System.out.println("도서 '" + book.getTitle() + "' 을(를) 반납합니다.");
    }
  }

  public void printBorrowedBooks() {
    if (borrowedBooks.isEmpty()) {
      System.out.println(name + "님은 대출한 책이 없습니다.");
    } else {
      for (Book book : borrowedBooks) {
        book.print();
      }
    }
  }
}
