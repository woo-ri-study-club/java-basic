package mission7.middle;

public class MiddleMain {
    public static void main(String[] args) {
        Corporation corporation = new Corporation();

        Employee emp1 = new Employee("John", 101);
        Employee emp2 = new Employee("Jane", 102);
        Employee emp3 = new Employee("Mike", 103);

        corporation.addEmployee(emp1);
        corporation.addEmployee(emp2);
        corporation.addEmployee(emp3);

        System.out.println("총 직원 수: " + corporation.getTotalEmployees());
    }
}
