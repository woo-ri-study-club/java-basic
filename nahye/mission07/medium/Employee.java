package mission07.medium;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static int getTotalEmployees(){
        return EmployeeManager.employeeCount;
    }
}
