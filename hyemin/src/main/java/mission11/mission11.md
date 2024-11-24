## 초급

추상 클래스 Shape는 getArea()라는 추상 메서드를 가지고 있습니다.
- Circle 클래스는 Shape를 상속받으며, 반지름을 매개변수로 받아 면적을 계산합니다.
- Rectangle 클래스는 Shape를 상속받으며, 가로와 세로를 매개변수로 받아 면적을 계산합니다.

다음 요구사항을 만족하는 클래스를 작성하세요.
- 추상 클래스 Shape를 정의하세요.
- Circle과 Rectangle 클래스를 작성하세요.
- 각 클래스에서 getArea() 메서드를 구현하세요.

``` java
public abstract class Shape {
    public abstract double getArea();
}

public class Circle extends Shape {
    // 여기에 Circle 클래스 내용을 작성하세요.
}

public class Rectangle extends Shape {
    // 여기에 Rectangle 클래스 내용을 작성하세요.
}
```

## 중급

인터페이스 Playable과 Pauseable은 각각 play()와 pause() 메서드를 가지고 있습니다.
- MediaPlayer 클래스는 두 인터페이스를 모두 구현합니다.
- play() 메서드는 "Playing..."을 출력하고, pause() 메서드는 "Paused."를 출력합니다.
- MediaPlayer 객체를 생성한 후, 다형성을 활용해 두 인터페이스 타입 변수로 각각 메서드를 호출해 보세요.

``` java
public interface Playable {
    void play();
}

public interface Pauseable {
    void pause();
}

public class MediaPlayer implements Playable, Pauseable {
    // 여기에 MediaPlayer 클래스 내용을 작성하세요.
}

public class Main {
    public static void main(String[] args) {
        // 다형성을 활용한 메서드 호출 코드를 작성하세요.
    }
}
```

## 고급

도서 관리 시스템을 설계하세요.
Book 인터페이스는 getTitle()과 getAuthor() 메서드를 제공합니다.

EBook과 PrintedBook 클래스는 각각 디지털 도서와 종이책을 나타내며, Book 인터페이스를 구현합니다.
- EBook 클래스는 파일 형식(format)을 추가로 저장합니다.
- PrintedBook 클래스는 출판사(publisher)를 추가로 저장합니다.

Library 클래스는 Book 타입의 리스트를 관리하며, 다음 기능을 제공합니다.
- 도서 추가하기
- 모든 도서 정보 출력하기

Main 클래스에서 도서 추가 및 출력 기능을 사용해보세요.