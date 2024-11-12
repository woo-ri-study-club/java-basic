## 초급

### 자바에서 기본형과 참조형의 차이를 설명하세요. 각각의 예를 들어보고, 새로운 변수에 할당할 때 어떻게 다르게 동작하는지 설명해보세요.

**기본형 vs 참조형 - 기본**

기본형은 숫자 `10` , `20` 과 같이 실제 사용하는 값을 변수에 담을 수 있다. 그래서 해당 값을 바로 사용할 수 있다. 
참조형은 실제 사용하는 값을 변수에 담는 것이 아니다. 이름 그대로 실제 객체의 위치(참조, 주소)를 저장한다. 
참조형에는 객체와 배열이 있다.
- 객체는 `.` (dot)을 통해서 메모리 상에 생성된 객체를 찾아가야 사용할 수 있다.
- 배열은 `[]` 를 통해서 메모리 상에 생성된 배열을 찾아가야 사용할 수 있다.

**기본형 vs 참조형 - 계산**

- 기본형은 들어있는 값을 그대로 계산에 사용할 수 있다.\
예) 더하고 빼고, 사용하고 등등, (숫자 같은 것들은 바로 계산할 수 있음)

- 참조형은 들어있는 참조값을 그대로 사용할 수 없다. 주소지만 가지고는 할 수 있는게 없다. 주소지에 가야 실체가 있다!\
예) 더하고 빼고 사용하고 못함! 참조값만 가지고는 계산 할 수 있는 것이 없음!\

기본형은 연산이 가능하지만 참조형은 연산이 불가능하다.

\
**변수 할당 시 동작**

대원칙: 자바는 항상 변수의 값을 복사해서 대입한다.\
자바에서 변수에 값을 대입하는 것은 변수에 들어 있는 값을 복사해서 대입하는 것이다.\
기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다. 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.
```java
int a = 10;
int b = a; // 값을 대입

Student s1 = new Student();
Student s2 = s1; // 주소값을 대입
```
## 중급

### 기본형과 참조형을 메서드의 매개변수로 전달할 때 동작 방식이 어떻게 다른지 보여주는 자바 프로그램을 작성하세요.
- 정수형(int)과 배열(array)을 매개변수로 받아 각각을 수정하려고 시도하는 메서드를 정의하세요.
- 실행 결과를 관찰하고, 기본형과 참조형이 메서드 호출 시 어떻게 다르게 동작하는지 설명하세요.
```java
package mission2;

import java.util.Arrays;

public class TypeMain {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("메서드 호출 전 number: " + number);
        modifyPrimitive(number);
        System.out.println("메서드 호출 후 number: " + number);

        int[] array = {1, 2, 3};
        System.out.println("메서드 호출 전 array: " + Arrays.toString(array));
        modifyReference(array);
        System.out.println("메서드 호출 후 array: " + Arrays.toString(array));
    }

    public static void modifyPrimitive(int number) {
        number = 20;
        System.out.println("modifyPrimitive 내의 number: " + number);
    }

    public static void modifyReference(int[] array) {
        array[0] = 10;
        System.out.println("modifyReference 내의 array: " + Arrays.toString(array));
    }
}
```
기본형은 값을 복사해서 전달하므로 메서드 호출 전/후에 number 값이 변경되지 않았고, \
참조형은 주소값을 복사해서 전달하므로 메서드 호출 전/후에 array 값이 변경되었다.\

기본형은 값이 복사되어 전달되므로 메서드 내 수정이 원본에 영향을 미치지 않지만, 참조형은 주소가 전달되므로 메서드 내 수정이 원본 데이터에 영향을 준다.

## 고급

### 참조형의 `null` 값과 `NullPointerException` 문제를 다루는 미니 프로젝트를 만들어 보세요.
- 여러 `Book` 객체를 포함하는 간단한 `Library` 클래스를 설계하세요.
- 책을 추가하고, 제목으로 책을 검색하고, 책의 세부 정보를 표시하는 메서드를 구현하세요.
- `Book` 객체 중 하나를 `null`로 남겨두고, 메서드를 통해 접근해 보세요.
- 참조형을 다룰 때 `NullPointerException`이 발생하는 이유를 설명하고, 이를 방지하는 방법을 제안해 보세요.

```java
package mission2;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author;
    }
}
```
```java
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

```
```java
package mission2;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("추가 가능한 범위를 초과했습니다.");
        }
    }

    public Book findBookByTitle(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new BookNotFoundException("책 '" + title + "'을 찾을 수 없습니다.");
    }

    public void printBookInfo(Book book){
        if (book == null) {
            throw new NullPointerException("책 정보를 찾을 수 없습니다.");
        }
        System.out.println(book);
    }
}

```

```java
package mission2;

public class BookMain {
    public static void main(String[] args) {
        Book[] books = {
                new Book("자바", "홍길동"),
                new Book("파이썬", "고길동"),
                null
        };

        Library library = new Library(5);
        for (Book book : books) {
            library.addBook(book);
        }

        try {
            printBookDetails(library, books[0].getTitle());
            printBookDetails(library, "없는 책"); // 예외 발생
            printBookDetails(library, books[2].getTitle());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    private static void printBookDetails(Library library, String title) {
        try {
            Book book = library.findBookByTitle(title);
            library.printBookInfo(book);
        } catch (BookNotFoundException e) {
            System.out.println("BookNotFoundException: " + e.getMessage());
        }

    }
}
```
NullPointerException은 참조형 변수가 null인 상태에서 해당 변수를 통해 메서드 호출이나 속성 접근을 시도할 때 발생한다.

**방지 방법**
- 객체를 사용하기 전에 항상 null인지 확인하고 처리하기
- Java 8 이상에서는 Optional 클래스를 사용하기
- try-catch 문을 사용하여 NullPointerException을 처리하기