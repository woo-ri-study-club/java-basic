package mission1.advanced;

import java.util.Arrays;

public class AdvancedMain {
    public static void main(String[] args) {
        Employee[] employees = {
                Employee.of("직원A", "STAFF", 260),
                Employee.of("직원B", "STAFF", 300),
                Employee.of("직원C", "MANAGER", 350),
                Employee.of("직원D", "STAFF", 280),
                Employee.of("직원E", "MANAGER", 380),
                Employee.of("CEO", "CEO", 1000)
        };

        findByPosition(employees, "STAFF");

    }

    public static void findByPosition(Employee[] employees, String position) {
        Employee[] foundEmployees = new Employee[employees.length];
        int index = 0;

        for (Employee employee : employees) {
            if (employee.isPosition(position)) {
                foundEmployees[index] = employee;
                index++;
            }
        }

        foundEmployees = Arrays.copyOf(foundEmployees, index);
        printEmployees(foundEmployees);
    }

    public static void printEmployees(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("해당 직원이 존재하지 않습니다.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
