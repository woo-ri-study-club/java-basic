package section08;

public class Employee {

  private static int totalEmployees;
  private String name;
  private int id;

  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
    totalEmployees++;
  }

  public static int getTotalEmployees() {
    return totalEmployees;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", id=" + id +
        '}';
  }
}
