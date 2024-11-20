package mission7.middle;

import java.util.ArrayList;
import java.util.List;

public class Corporation {
    private static int totalEmployees;
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
        totalEmployees++;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }
}
