package advance;

public class Employee {

    private String name;

    private String position;

    private long salary;

    public Employee(String name, String position, long salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public boolean isPosition(String position) {
        return this.position.equalsIgnoreCase(position);
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 급여: " + salary;
    }
}
