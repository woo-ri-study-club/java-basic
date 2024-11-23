## 초급

다형성의 개념을 간단히 설명하고, 다음 코드의 출력 결과를 작성하세요.

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
        animal.sound();
    }
}
```
------------------------
출력 결과= Dog barks

Animal class에 부모클래스변수가  자식클래스에 인스턴스로 참조 되어서 부모에 있는 sound() 메서드가 실행되겠지만 
@Override가 항상 우선권을 가진다. 그래서 제일 밑에 자손의 @Override가 우선권을 가져서 Dog class의 sound()메서드가 호출된다.

다형성은 한 객체가 여러 타입의 클래스를 사용할될수있다. 단 서로 상속관계여야한다.

------------
## 중급

instanceof를 사용하여 다음 조건을 만족하는 프로그램을 작성하세요.
- Animal 클래스와 이를 상속받는 Cat, Dog 클래스가 있습니다.
- Animal 배열에 다양한 객체를 저장하고, instanceof를 사용해 각 객체의 타입에 따라 적절한 메시지를 출력하세요.
    - Dog인 경우 "개입니다.", Cat인 경우 "고양이입니다.".

## 고급

Shape라는 추상 클래스를 생성하고, 이를 상속받는 Circle과 Rectangle 클래스를 구현하세요. 다음 요구사항을 만족하는 프로그램을 작성하세요.
- Shape 클래스는 calculateArea()라는 추상 메서드와 displayArea()라는 일반 메서드를 포함합니다.
    - calculateArea()는 각 도형의 면적을 계산합니다.
    - displayArea()는 면적을 출력합니다.
- Circle 클래스는 반지름을 매개변수로 받아 면적을 계산합니다.
- Rectangle 클래스는 가로와 세로를 매개변수로 받아 면적을 계산합니다.
- 메인 메서드에서 다형성을 사용해 다양한 Shape 객체를 관리하고, 각 도형의 면적을 출력하세요.
