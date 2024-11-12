package mission1.advanced;

import java.util.ArrayList;
import java.util.List;

public class Corporation {
    private Employee[] employees;

    private Corporation(Employee[] employees) {
        this.employees = employees;
    }

    public static Corporation of(Employee[] employees) {
        return new Corporation(employees);
    }

    public void findByPosition(String position) {
        List<Employee> foundEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) {
                foundEmployees.add(employee);
            }
        }

        if (!foundEmployees.isEmpty()) {
            for (Employee employee : foundEmployees) {
                employee.printEmployee();
            }
        }
    }

}
