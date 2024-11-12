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

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void printEmployee() {
        System.out.println("성함: " + this.getName() + " | 직급: " + this.getPosition() + " | 월급: " + this.getSalary());
    }
}
