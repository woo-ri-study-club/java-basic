## 초급

### 1. 클래스가 필요한 이유를 간단히 설명하고, 자동차(Car) 클래스를 정의하여 `String brand`, `int year` 속성을 가지도록 하세요. 이 클래스를 사용하여 `Car` 객체를 하나 생성하고, brand와 year 값을 할당하는 코드를 작성하세요.

-> 학생들의 이름, 나이, 성적을 배열을 통해 각각 따로 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다. 데이터의 추가/삭제/수정이 필요하면 실수가 발생할 수 있기 때문이다. 
사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것이다. 그리고 각각의 학생 별로 본인의 이름, 나이, 성적 을 관리하는 것이다. 이 때문에 클래스에 각각의 필드를 선언해서 인스턴스화하여 사용하는 것이 필요하다.

```java
public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
```
```java
public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("테슬라", 2024);

        System.out.println("[내 차 정보] 브랜드: " + myCar.getBrand() + ", 년도: " + myCar.getYear());
    }
}
```

## 중급

### 1. "클래스, 객체, 인스턴스"의 차이점을 설명한 후, 학생(Student) 정보를 관리하는 간단한 프로그램을 작성하세요.
- `Student` 클래스는 `name`, `age`, `grade` 속성을 가지고, 이를 초기화하는 생성자와 각 속성을 반환하는 메서드를 포함해야 합니다.
- 다섯 명의 `Student` 객체를 배열로 생성하고, 각 학생의 정보를 출력하는 코드를 작성하세요.
  

#### 클래스 - Class
클래스는 객체를 생성하기 위한 '틀' 또는 '설계도'이다. 클래스는 객체가 가져야 할 속성(변수)과 기능(메서드)를 정의한다. 예를 들어 학생이라는 클래스는 속성으로 `name` , `age` , `grade` 를 가진다. 참고로 기능(메서드)은 뒤에서 설명한다. 지금은 속성(변수)에 집중하자.
- 틀: 붕어빵 틀을 생각해보자. 붕어빵 틀은 붕어빵이 아니다! 이렇게 생긴 붕어빵이 나왔으면 좋겠다고 만드는 틀일 뿐이다. 실제 먹을 수 있는 것이 아니다. 실제 먹을 수 있는 팥 붕어빵을 객체 또는 인스턴스라 한다.
- 설계도: 자동차 설계도를 생각해보자. 자동차 설계도는 자동차가 아니다! 설계도는 실제 존재하는 것이 아니라 개념으로만 있는 것이다. 설계도를 통해 생산한 실제 존재하는 흰색 테슬라 모델 Y 자동차를 객체 또는 인스턴스라 한다.

#### 객체 - Object
객체는 클래스에서 정의한 속성과 기능을 가진 실체이다. 객체는 서로 독립적인 상태를 가진다.
예를 들어 위 코드에서 `student1` 은 학생1의 속성을 가지는 객체이고, `student2` 는 학생2의 속성을 가지는 객체이다. `student1` 과 `student2` 는 같은 클래스에서 만들어졌지만, 서로 다른 객체이다.

#### 인스턴스 - Instance
인스턴스는 특정 클래스로부터 생성된 객체를 의미한다. 그래서 객체와 인스턴스라는 용어는 자주 혼용된다. 인스턴스 는 주로 객체가 어떤 클래스에 속해 있는지 강조할 때 사용한다. 예를 들어서 `student1` 객체는 `Student` 클래스의 인스턴스다. 라고 표현한다.

#### 객체 vs 인스턴스
둘다 클래스에서 나온 실체라는 의미에서 비슷하게 사용되지만, 용어상 인스턴스는 객체보다 좀 더 관계에 초점을 맞춘 단어이다. 보통 `student1` 은 `Student` 의 객체이다. 라고 말하는 대신 `student1` 은 `Student` 의 인스턴스이다. 라고 특정 클래스와의 관계를 명확히 할 때 인스턴스라는 용어를 주로 사용한다.
좀 더 쉽게 풀어보자면, 모든 인스턴스는 객체이지만, 우리가 인스턴스라고 부르는 순간은 특정 클래스로부터 그 객체가 생성되었음을 강조하고 싶을 때이다. 예를 들어 `student1` 은 객체이지만, 이 객체가 `Student` 클래스로부터 생성되 다는 점을 명확히 하기 위해 `student1` 을 `Student` 의 인스턴스라고 부른다.
하지만 둘다 클래스에서 나온 실체라는 핵심 의미는 같기 때문에 보통 둘을 구분하지 않고 사용한다.

```java
public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }
}
```
```java
public class StudentMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("가나다", 14, 90),
                new Student("라마바", 15, 70),
                new Student("사아자", 16, 80),
                new Student("차카타", 14, 95),
                new Student("파하가", 15, 60),
        };

        for (Student student : students) {
            System.out.println("이름: "+ student.getName() + ", 나이 : " + student.getAge() + ", 성적: " + student.getGrade());
        }
    }
}
```

## 고급

[미니 프로젝트] 회사의 직원(Employee) 정보를 관리하는 프로그램을 만들어 보세요.
- `Employee` 클래스는 `name`, `position`, `salary` 속성을 가져야 하며, 생성자와 각 속성을 반환하는 메서드를 포함해야 합니다.
- 이 프로그램은 `Employee` 객체 배열을 사용하여 여러 직원 정보를 저장하고, 특정 직책의 직원 정보만 필터링하여 출력하는 기능을 제공해야 합니다.
- 특정 직책을 입력 받아 해당 직책을 가진 모든 직원의 정보를 출력하는 `findByPosition(String position)` 메서드를 구현하세요.

```java
public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
```
```java
public class Company {
    private Employee[] employees;

    public Company(Employee[] employees){
        this.employees = employees;
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public void findByPosition(String position){
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) {
                System.out.println("이름: " + employee.getName() + ", 직책: " + employee.getPosition() + ", 급여: " + employee.getSalary());
            }
        }
    }
}

```
```java
public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("A", "Manager", 100),
                new Employee("B", "CEO", 10000),
                new Employee("C", "Manager", 110),
                new Employee("D", "CTO", 9000),
                new Employee("E", "Manager", 150),
        };

        Company company = new Company(employees);
        company.findByPosition("Manager");
    }
}
```