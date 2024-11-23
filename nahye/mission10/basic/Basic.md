### 초급

다형성의 개념을 간단히 설명하고, 다음 코드의 출력 결과를 작성하세요.

```java
lass Animal {
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

> 출력결과 : Dog barks  
> 
> 다형성이란 한 객체가 여러가지 타입의 객체로 취급될수 있는 능력을 뜻한다.  
> 크게 다형적 참조와 메서드 오버라이딩이 있다.  
> 다형성을 활용하면 객체의 타입에 의존하지 않고 공통된 인터페이스나 상위 클래스의 메서드를 사용함으로써   
> 다양한 객체를 일관되게 다룰 수 있다.

