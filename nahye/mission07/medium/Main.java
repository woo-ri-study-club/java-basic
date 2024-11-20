package mission07.medium;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();

        Employee emp1 = employeeManager.add("John", 101);
        Employee emp2 = employeeManager.add("Jane", 102);
        Employee emp3 = employeeManager.add("Mike", 103);

        System.out.println("총 직원 수: " + Employee.getTotalEmployees());
    }
}