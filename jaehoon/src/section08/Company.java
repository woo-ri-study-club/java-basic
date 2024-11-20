package section08;

import java.util.ArrayList;
import java.util.List;

public class Company {

  private static int totalEmployees;

  private String name;

  private final List<Employee> employees = new ArrayList<>();

  public Company(String name) {
    this.name = name;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
    totalEmployees++;
  }

  public String getName() {
    return name;
  }

  public void viewEmployees() {
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }

  public static int getTotalEmployees() {
    return totalEmployees;
  }
}
