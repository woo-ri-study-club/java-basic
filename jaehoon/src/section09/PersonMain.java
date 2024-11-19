package section09;

public class PersonMain {

  public static void main(String[] args) {
    final Person person = new Person("noah");

    // final로 선언된 Person객체의 참조값은 한번만 할당되기 때문에 참조값을 변경할 수 없다.
    // person = new Person(); // 컴파일 오류
    System.out.println("Person 참조대상의 값 변경 전 = " + person.getName());

    // 그러나, person 객체의 값인 name은 final이 아니기때문에 변경할 수 있다.
    person.setName("joe");
    System.out.println("Person 참조대상의 값 변경 후 = " + person.getName());

  }
}
