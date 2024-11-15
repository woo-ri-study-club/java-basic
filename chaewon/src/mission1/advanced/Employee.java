package mission1.advanced;

public class Employee {
    private final String name;
    private final String position;
    private final int salary;

    private Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static Employee of(String name, String position, int salary) {
        return new Employee(name, position, salary);
    }

    public boolean isPosition(String position){
        return position.equalsIgnoreCase(this.position);
    }

    @Override
    public String toString() {
        return "성함: " + name + " | 직급: " + position + " | 월급: " + salary;
    }
}
