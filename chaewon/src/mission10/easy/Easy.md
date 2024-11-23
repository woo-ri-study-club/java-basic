> 다형성의 개념을 간단히 설명하고, 다음 코드의 출력 결과를 작성하세요.

```java
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

### 다형성
- 한 객체가 다양한 타입으로 사용 가능
- **다형성 참고**
  - `Animal animal = new Dog();` 이 부분이 다형성을 참고한 부분이다.
  - 단, 자식에만 존재하는 기능은 호출할 수 없다! (**다운캐스팅**을 했다면 가능하다.)
- **오버라이딩**

### 출력 결과
- Animal을 참조하는 Dog 객체의 인스턴스를 메인에서 생성했기 때문에, `animal.sound()`를 호출 시 Dog에서 오버라이드 된 `sound()` 메서드의 출력문이 출력된다. 즉, `"Dog barks"`이 출력된다.