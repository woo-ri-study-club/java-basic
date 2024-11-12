package section01;

public class EmployeeTest {

  public static void main(String[] args) {
    Employee[] employees = {
        new Employee("조인성", "Manager", 7000),
        new Employee("류승룡", "Manager", 7500),
        new Employee("이정하", "Developer", 6000),
        new Employee("고윤정", "Developer", 6500),
        new Employee("한효주", "Designer", 5500)
    };

    Company company = new Company(employees);
    System.out.println("### Developer 검색 ###");
    company.findByPosition("Developer");
  }
}

