## 초급

### 자바의 스택 영역과 힙 영역에 대해 설명하세요. 각 영역이 어떤 종류의 데이터를 저장하는지와 역할을 간단히 서술해보세요.
자바의 메모리 구조는 크게 메서드 영역, 스택 영역, 힙 영역 3개로 나눌 수 있다.

**메서드 영역(Method Area)**: 
- 메서드 영역은 프로그램을 실행하는데 필요한 공통 데이터를 관리한다. 이 영역은 프로그램의 모든 영역에서 공유한다.
    - 클래스 정보: 클래스의 실행 코드(바이트 코드), 필드, 메서드와 생성자 코드등 모든 실행 코드가 존재한다. 
    - static 영역: `static` 변수들을 보관한다.
    - 런타임 상수 풀: 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관한다. 예를 들어서 프로그램에 `"hello"` 라는 리터럴 문자가 있으면 이런 문자를 공통으로 묶어서 관리한다. 이 외에도 프로그램을 효율적으로 관리하기 위한 상수들을 관리한다. \
  (참고로 문자열을 다루는 문자열 풀은 자바 7부터 힙 영역으로 이동했다.)

**스택 영역(Stack Area)**: 
- 자바 실행 시, 하나의 실행 스택이 생성된다. 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함한다.
  - 스택 프레임: 스택 영역에 쌓이는 네모 박스가 하나의 스택 프레임이다. 메서드를 호출할 때 마다 하나의 스택 프레임이 쌓이고, 메서드가 종료되면 해당 스택 프레임이 제거된다.

**힙 영역(Heap Area)**: 
- 객체(인스턴스)와 배열이 생성되는 영역이다. 가비지 컬렉션(GC)이 이루어지는 주요 영역이며, 더 이상 참조되지 않는 객체는 GC에 의해 제거된다.

## 중급

### 다음 코드를 참고하여 `Employee` 클래스를 작성하고, `static` 변수를 사용해 총 직원 수를 관리하세요. `Employee` 클래스는 각 직원의 이름과 ID를 저장해야 하며, 직원이 생성될 때마다 직원 수가 자동으로 증가해야 합니다. `Employee` 객체를 여러 개 생성한 후 총 직원 수를 출력하는 코드를 작성하세요.

``` java
public class Employee {
    // 여기에 코드를 작성하세요
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101);
        Employee emp2 = new Employee("Jane", 102);
        Employee emp3 = new Employee("Mike", 103);

        System.out.println("총 직원 수: " + Employee.getTotalEmployees());
    }
}
```

## 고급

### 메모리 사용을 최적화하기 위해 싱글턴 패턴과 `static` 변수를 활용하여 `ConfigurationManager` 클래스를 구현하세요. `ConfigurationManager`는 애플리케이션의 설정 정보를 관리하며, `static` 변수를 사용해 인스턴스를 한 번만 생성해야 합니다. `getInstance()` 메서드를 사용하여 인스턴스를 반환하고, 설정 값을 추가하고 가져오는 메서드를 구현하세요.

``` java
public class ConfigurationManager {
    // 여기에 싱글턴 패턴과 static 변수를 사용하여 코드를 작성하세요

    public void setConfig(String key, String value) {
        // 설정 값을 저장하는 메서드
    }

    public String getConfig(String key) {
        // 설정 값을 가져오는 메서드
    }
}

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setConfig("url", "http://woo-ri-study-club.com");
        config.setConfig("timeout", "5000");

        System.out.println("URL: " + config.getConfig("url"));
        System.out.println("Timeout: " + config.getConfig("timeout"));
    }
}
```
