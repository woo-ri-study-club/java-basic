public class Employee {
    private final String name;
    private final String position;
    private final Integer salary;

    private Employee(final String name, final String position, final Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static Employee create(final String name, final String position, final Integer salary) {
        return new Employee(name, position, salary);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Integer getSalary() {
        return salary;
    }
}
