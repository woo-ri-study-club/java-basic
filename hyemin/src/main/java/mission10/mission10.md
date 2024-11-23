## 초급

### 다형성의 개념을 간단히 설명하고, 다음 코드의 출력 결과를 작성하세요.

``` java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // 메서드 오버라이딩으로 Dog barks 가 출력된다!
    }
}
```

다형성은 한 객체가 여러 타입의 객체로 취급될 수 있는 것을 뜻한다. 
- **다형적 참조**: 자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다. 이것이 바로 다양한 형태를 참조할 수 있다고 해서 **다형적 참조**라 한다.
- **메서드 오버라이딩** : 메서드 오버라이딩에서 중요한 점은 **오버라이딩 된 메서드가 항상 우선권을 가진다**는 점이다.
## 중급

### instanceof를 사용하여 다음 조건을 만족하는 프로그램을 작성하세요.
- Animal 클래스와 이를 상속받는 Cat, Dog 클래스가 있습니다.
- Animal 배열에 다양한 객체를 저장하고, instanceof를 사용해 각 객체의 타입에 따라 적절한 메시지를 출력하세요.
    - Dog인 경우 "개입니다.", Cat인 경우 "고양이입니다.".

## 고급

### Shape라는 추상 클래스를 생성하고, 이를 상속받는 Circle과 Rectangle 클래스를 구현하세요. 다음 요구사항을 만족하는 프로그램을 작성하세요.
- Shape 클래스는 calculateArea()라는 추상 메서드와 displayArea()라는 일반 메서드를 포함합니다.
    - calculateArea()는 각 도형의 면적을 계산합니다.
    - displayArea()는 면적을 출력합니다.
- Circle 클래스는 반지름을 매개변수로 받아 면적을 계산합니다.
- Rectangle 클래스는 가로와 세로를 매개변수로 받아 면적을 계산합니다.
- 메인 메서드에서 다형성을 사용해 다양한 Shape 객체를 관리하고, 각 도형의 면적을 출력하세요.
