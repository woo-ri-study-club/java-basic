package mission4.advanced;

public class Library {
   private Book[] books;
   private int count;

    public Library(int size) {
        this.books = new Book[size];
    }

    public Book addBook(Book book){
        if (count >= books.length){
            throw new IllegalArgumentException("도서를 추가하기 위한 용량이 부족합니다.");
        }

        books[count] = book;
        return books[count++];
    }

    public Book searchBook(String title){
        for(Book book : books){
            if (book.isSameTitle(title)){
                return book;
            }
        }

        throw new IllegalArgumentException("검색한 도서명과 동명의 도서가 없습니다.");
    }
}
