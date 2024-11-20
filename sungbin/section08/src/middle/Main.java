package middle;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "양성빈"));
        manager.addEmployee(new Employee(2, "양성빈"));
        manager.addEmployee(new Employee(3, "양성빈"));

        System.out.println("총 직원 수: " + manager.getTotalEmployees());
    }
}
