/*
왜 NullPointerException이 발생할까?

객체가 참조하는 주소값이 아무것도 참조하지 않는다는 null을 가질 때 이 객체의 메서드를 호출하려 할 경우 발생한다.
이를 방지하기 위해서 메서드를 호출하기 전 null 체크를 해주거나 null 될 수 있는 객체에 대해서 적절한 처리가 가능한 Optional을 사용할 수 있다.
 */
package section3.mission3;

public class Mission3 {

    public static void main(String[] args) {

        Library library = Library.emptyLibrary();

        library.addBook(Book.of("Book1", "이작가", 15000));
        library.addBook(Book.of("Book2", "윤작가", 20000));
        library.addBook(Book.of("Book3", "최작가", 25000));
        library.addBook(Book.of("book3", "박작가", 30000));
        library.addBook(Book.of("Book4", "양작가", 35000));
        library.addBook(Book.of("Book5", "한작가", 40000));

        //Library 전체출력
        library.showLibrary();

        //book 객체를 null로 두고 접근시도
        Book[] findBooks = library.findByTitle("book3");
        for (Book findBook : findBooks) {
            findBook = null;
            //System.out.println(findBook.toString()); //toString메서드 사용 시 NullPointerException 발생!
        }
    }
}
