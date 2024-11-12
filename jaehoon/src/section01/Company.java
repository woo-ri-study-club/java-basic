package section01;

class Company {

  private final Employee[] employees;

  public Company(Employee[] employees) {
    this.employees = employees;
  }

  public void findByPosition(String position) {
    System.out.println("직원(" + position + ") 목록");

    for (Employee employee : employees) {
      if (employee.isPosition(position)) {
        System.out.println("이름: " + employee.getName() + ", 연봉: " + employee.getSalary());
      }
    }

  }

}
