package mission1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("A", "Manager", 100),
                new Employee("B", "CEO", 10000),
                new Employee("C", "Manager", 110),
                new Employee("D", "CTO", 9000),
                new Employee("E", "Manager", 150),
        };

        Company company = new Company(employees);
        company.findByPosition("Manager");
    }
}
