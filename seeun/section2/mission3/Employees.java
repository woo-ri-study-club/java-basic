package section2.mission3;

public class Employees {

    private final Employee[] employees;

    public Employees(Employee[] employees) {
        this.employees = employees;
    }

    public void findByPosition(String position) {
        for (Employee employee : employees) {
            if (employee.isPosition(position)) {
                System.out.println("이름: " + employee.getName() + ", 직무: " + employee.getPosition() + ", 급여: " + employee.getSalary());
            }
        }
    }
}
