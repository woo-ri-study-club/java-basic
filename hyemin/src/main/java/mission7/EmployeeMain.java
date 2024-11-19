package mission7;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101);
        Employee emp2 = new Employee("Jane", 102);
        Employee emp3 = new Employee("Mike", 103);

        System.out.println("총 직원 수: " + Employee.getTotalEmployees());
    }
}
