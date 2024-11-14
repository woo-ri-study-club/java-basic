public class Employee {
    private final String name;
    private final String position;
    private final int salary;

    private Employee(final String name, final String position, final Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static Employee create(final String name, final String position, final int salary) {
        return new Employee(name, position, salary);
    }

    public boolean equalsPosition(final String position) {
        return this.position.equals(position);
    }

    @Override
    public String toString() {
        return """
            name = %s
            position = %s
            salary = %d
            """.formatted(name, position, salary);
    }
}
