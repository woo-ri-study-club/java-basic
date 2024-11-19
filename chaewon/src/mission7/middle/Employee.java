package mission7.middle;

public class Employee {
    private static int total;
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        total++;
    }

    public static int getTotalEmployees() {
        return total;
    }

}
