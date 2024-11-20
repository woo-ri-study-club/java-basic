package mission7;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Employee("John", 101));
        company.addEmployee(new Employee("Jane", 102));
        company.addEmployee(new Employee("Mike", 103));

        System.out.println("총 직원 수: " + company.getTotalEmployees());
    }
}
