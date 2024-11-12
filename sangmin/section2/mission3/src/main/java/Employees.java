import java.util.ArrayList;
import java.util.List;

public class Employees {
    private final List<Employee> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void findPosition(final String position) {
        employees.stream()
                .filter(employee -> employee.getPosition().equals(position))
                .forEach(employee -> System.out.println("Position: " + employee.getPosition() + ", Name: " + employee.getName() + ", salary: " + employee.getSalary()));
    }
}
