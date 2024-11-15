# 초급
> 클래스가 필요한 이유를 간단히 설명하고, 자동차(Car) 클래스를 정의하여 String brand, int year 속성을 가지도록 하세요. 이 클래스를 사용하여 Car 객체를 하나 생성하고, brand와 year 값을 할당하는 코드를 작성하세요. 

## 클래스 ＝ 특정 개념을 나타내는 설계도 
### 클래스의 장점
여러 변수를 하나 하나 작성해 자동차에 대한 데이터를 기술한다고 가정해보자.

**클래스 미적용**

```java
public class Ex {
    public static void main(String[] args) {
        String car1Brand = "현대";
        int car1Year = 2021;
        
        ...
        
    }
}
```

이런 형태로 자동차 100대에 대한 데이터를 입력해야 한다면,
1. 가독성 저하
2. 동일한 형태의 코드 중복
3. 각 데이터를 배열에 저장한다면, 관리의 어려움(유지보수성 ↓)

의 문제가 발생한다. 클래스의 사용은 이 문제점을 해결할 수 있다.

**클래스의 적용**

```java
public class Car {
    String brand;
    int year;
}

public class EasyMain {
    public static void main(String[] args) {
        Car hyundai = new Car();
        hyundai.brand = "현대";
        hyundai.year = 2021;

        Car tesla = new Car();
        tesla.brand = "테슬라";
        tesla.year = 2003;

        Car[] garage = {hyundai, tesla};

        for (Car car : garage) {
            System.out.println("브랜드: " + car.brand + ", 출시연도: " + car.year);
        }
    }
}
```

`Car`라는 큰 개념에 `brand`와 `year`을 필드로 둬 설계도를 작성할 수 있다. 해당 설계도를 바탕으로 객체를 생성하고 `.(fieldName)` 형식으로 값을 호출, 할당할 수 있다.