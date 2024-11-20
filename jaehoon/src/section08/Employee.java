package section08;

public class Employee {

  private int id;
  private String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "직원{" +
        "ID='" + id + '\'' +
        ", 이름=" + name +
        '}';
  }
}
