package com.library.books;

public class Book {

  private String title;

  private String author;

  private String isBn;

  private boolean isCheckedOut;

  public Book(String title, String author, String isBn) {
    this.title = title;
    this.author = author;
    this.isBn = isBn;
    this.isCheckedOut = false; // 기본값은 대출되지 않은 상태
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getIsBn() {
    return isBn;
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }

  public void checkout() {
    this.isCheckedOut = true;
  }

  public void returnBook() {
    this.isCheckedOut = false;
  }

  public void print() {
    System.out.println("도서{제목= " + title + ", 저자= " + author + ", 도서고유번호: " + isBn + "}");
  }
}