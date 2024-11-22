## 스택 영역
- 저장 데이터
  - 메서드 호출에 따른 지역 변수와 매개변수.
  - 메서드 호출 시의 상태 정보를 포함한 스택 프레임.
  - 메서드 실행이 끝나면 스택 프레임이 제거됩니다.
- 특징
  - LIFO(Last In, First Out) 구조로 데이터를 관리합니다.
  - 데이터를 빠르게 저장하고 제거할 수 있습니다.
  - 데이터의 수명이 짧으며, 메모리 누수가 적습니다.
- 예시

```java
public static void main(String[] args) {
    int x = 10; // x는 스택에 저장
    int y = calculate(x); // calculate 호출 시 매개변수 x의 복사본이 스택에 저장
}

public static int calculate(int value) {
    int result = value * 2; // result도 스택에 저장
    return result; // 메서드 종료 시 스택에서 result와 value 제거
}
```

## 힙 영역
- 저장 데이터
  - new 키워드로 생성된 객체와 배열
  - 객체가 포함하는 인스턴스 변수
- 특징
  - 동적 메모리 할당이 이루어집니다.
  - 객체의 수명은 가비지 컬렉터에 의해 관리됩니다.
  - 메모리 관리가 스택보다 느리지만, 유연성이 높습니다.
- 예시

```java
public static void main(String[] args) {
    Person person = new Person("John"); // person 객체는 힙에 저장
}

class Person {
    String name; // name도 힙에 저장
    public Person(String name) {
        this.name = name;
    }
}
```