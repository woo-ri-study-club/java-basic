# section10 요구사항 정리

### 초급
다음 코드를 완성하여 Animal 클래스를 상속받은 Dog 클래스에서 sound 메서드를 호출하면 "왈왈!"가 출력되도록 하세요.
```java
public class Animal {
    public void sound() {
        System.out.println("동물을 소리를 낼 수 있다.");
    }
}

// 여기에 Dog 클래스를 작성하세요.

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // "왈왈!" 출력
    }
}
```

### 중급
다음과 같은 요구 사항을 만족하는 클래스를 작성하세요.

- Vehicle 클래스를 생성하고, 이 클래스는 maxSpeed라는 필드를 가지고 있습니다.
- Vehicle 클래스를 상속받는 Car 클래스를 작성하세요.
- Car 클래스는 brand라는 추가 필드를 가지고 있으며, Vehicle의 maxSpeed를 초기화하기 위한 생성자를 호출해야 합니다.
- Car 클래스의 showDetails 메서드는 브랜드와 최대 속도를 출력해야 합니다.

- 출력 예시
`Brand: Tesla, Max Speed: 200`

### 고급
도서 관리 시스템을 상속 관계로 구현하세요.

- Book 클래스:
  - title(제목), author(저자), price(가격) 필드를 포함합니다. 
  - displayDetails 메서드를 통해 책의 세부 정보를 출력합니다. 
- EBook 클래스:
  - Book을 상속받습니다. 
  - 추가 필드로 fileSize(파일 크기)와 format(파일 형식)을 가집니다. 
  - displayDetails 메서드를 오버라이드하여, 파일 크기와 형식을 추가로 출력합니다.
- Library 클래스:
  - 책 목록(ArrayList)을 관리합니다. 
  - addBook 메서드로 책을 추가하고, showAllBooks 메서드로 모든 책의 세부 정보를 출력합니다.

- 출력 예시
```text
Title: Clean Code, Author: Robert C. Martin, Price: 45
Title: Effective Java, Author: Joshua Bloch, Price: 50, File Size: 3MB, Format: PDF
```