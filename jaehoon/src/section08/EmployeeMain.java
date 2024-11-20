package section08;

public class EmployeeMain {

  public static void main(String[] args) {
    Employee emp1 = new Employee(101, "이재훈");
    Employee emp2 = new Employee(102, "이선영");
    Employee emp3 = new Employee(103, "김원중");

    Company company = new Company("우리들의스터디클럽");
    company.addEmployee(emp1);
    company.addEmployee(emp2);
    company.addEmployee(emp3);

    System.out.println("기업명: " + company.getName());
    System.out.println("총 직원 수: " + Company.getTotalEmployees());
    System.out.println("### 직원 목록 ###");
    company.viewEmployees();
  }
}
