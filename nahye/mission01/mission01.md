## 초급

클래스가 필요한 이유를 간단히 설명하고, 자동차(Car) 클래스를 정의하여 String brand, int year 속성을 가지도록 하세요. 이 클래스를 사용하여 Car 객체를 하나 생성하고, brand와 year
값을 할당하는 코드를 작성하세요.

클래스를 사용하면 같은 속성을 가진 데이터를 묶을수있고, 코드의 수정이나 확장이 더 쉬워진다.

```java
public class Car {
    String brand;
    int year;
}
```

📎 [BasicEx.java](./BasicEx.java)

## 중급

"클래스, 객체, 인스턴스"의 차이점을 설명한 후, 학생(Student) 정보를 관리하는 간단한 프로그램을 작성하세요.

- Student 클래스는 name, age, grade 속성을 가지고, 이를 초기화하는 생성자와 각 속성을 반환하는 메서드를 포함해야 합니다.
- 다섯 명의 Student 객체를 배열로 생성하고, 각 학생의 정보를 출력하는 코드를 작성하세요.

클래스 객체를 만들기 위한 틀, 설계도라고 할수있다. 객체가 가져야할 속성과 기능을 정의한다.  

객체는 클래스(설계도)로부터 생성된 실제 데이터로 메모리에 존재한다. 객체는 여러새 생성될 수 있으며 독립적으로 존재한다.  

인스턴스는 객체와 거의 동일한 의미로 사용되지만, 객체가 특정 클래스의 구현물일 때를 강조할 때 사용한다.  
예를 들어 Car car = new Car(); 일때 car는 Car 클래스의 인스턴스이다.

📎 [Student.java](./Student.java)  
📎 [MediumEx.java](./MediumEx.java)

## 고급

[미니 프로젝트] 회사의 직원(Employee) 정보를 관리하는 프로그램을 만들어 보세요.

- Employee 클래스는 name, position, salary 속성을 가져야 하며, 생성자와 각 속성을 반환하는 메서드를 포함해야 합니다.
- 이 프로그램은 Employee 객체 배열을 사용하여 여러 직원 정보를 저장하고, 특정 직책의 직원 정보만 필터링하여 출력하는 기능을 제공해야 합니다.
- 특정 직책을 입력 받아 해당 직책을 가진 모든 직원의 정보를 출력하는 findByPosition(String position)메서드를 구현하세요.

📎 [AdvancedEx.java](./AdvancedEx.java)