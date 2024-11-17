package section05;

public class Person {

  private String name;

  private int age;

  public Person() {
    this("Unknown", 0);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
