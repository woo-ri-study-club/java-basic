package mission7;

public class Employee {

    private String name;
    private int id;

    private static int totalEmployees;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }
}
