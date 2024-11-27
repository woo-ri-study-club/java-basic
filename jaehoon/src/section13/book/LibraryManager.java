package section13.book;

import section13.user.User;

import java.util.List;

public interface LibraryManager {

  // 책 검색 (일반, 관리자 모두 사용)
  Book searchByIsbn(String isbn);

  // 모든 책 조회
  void viewAllBooks();

  // 책 대출 (일반 전용)
  void checkedOutBook(User user, String isbn);

  // 책 반납 (일반 전용)
  void returnBook(User user, String isbn);

  // 빌린 도서 조회 (일반 전용)
  List<Book> getBorrowedBooksByUserId(String userId);

  // 대출한 책 목록 조회 (일반 전용)
  void viewBorrowedBooks(User user);

  // 책 등록 (관리자 전용)
  void addBook(String isbn, String title, String author);

  // 책 삭제 (관리자 전용)
  void deleteBook(Book book);

  // 대출한 회원 리스트 조회 (관리자 전용)
  void viewBorrowedUserIds();

}
