package mission07.medium;

public class EmployeeManager {
    public static int employeeCount;

    public Employee add(String name, int id){
        employeeCount++;
        return new Employee(name, id);
    }
}
