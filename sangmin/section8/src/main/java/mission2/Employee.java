package mission2;

public class Employee {
    private static int TOTAL_EMPLOYEES = 0;

    private String name;
    private int id;

    public Employee(final String name, final int id) {
        this.name = name;
        this.id = id;
        TOTAL_EMPLOYEES++;
    }

    public static int getTotalEmployees() {
        return TOTAL_EMPLOYEES;
    }
}
