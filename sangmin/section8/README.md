# section8 요구사항 정리

### 초급
- 자바의 스택 영역과 힙 영역에 대해 설명하세요. 각 영역이 어떤 종류의 데이터를 저장하는지와 역할을 간단히 서술해보세요.

### 중급
- 다음 코드를 참고하여 Employee 클래스를 작성하고, static 변수를 사용해 총 직원 수를 관리하세요. 
- Employee 클래스는 각 직원의 이름과 ID를 저장해야 하며, 직원이 생성될 때마다 직원 수가 자동으로 증가해야 합니다. 
- Employee 객체를 여러 개 생성한 후 총 직원 수를 출력하는 코드를 작성하세요.

```java
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
### 고급
- 메모리 사용을 최적화하기 위해 싱글턴 패턴과 static 변수를 활용하여 ConfigurationManager 클래스를 구현하세요. 
- ConfigurationManager는 애플리케이션의 설정 정보를 관리하며, static 변수를 사용해 인스턴스를 한 번만 생성해야 합니다. 
- getInstance() 메서드를 사용하여 인스턴스를 반환하고, 설정 값을 추가하고 가져오는 메서드를 구현하세요.

```java
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
