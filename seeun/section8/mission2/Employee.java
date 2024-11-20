package section8.mission2;

public class Employee {
    private String name;
    private int id;
    private static int count;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }

    public static int getTotalEmployees() {
        return count;
    }
}
