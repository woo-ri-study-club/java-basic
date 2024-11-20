package mission07.medium;

public class Employee {
    private String name;
    private int id;
    private static int employeeCount;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public static int getTotalEmployees(){
        return employeeCount;
    }
}
