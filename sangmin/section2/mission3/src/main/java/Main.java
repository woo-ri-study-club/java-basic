import java.util.Arrays;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {

        employees = new Employee[]{
                Employee.create("사원1", "사원", 2000),
                Employee.create("사원2", "사원", 2000),
                Employee.create("사원3", "사원", 2000),
                Employee.create("대리1", "대리", 3000),
                Employee.create("대리2", "대리", 3000),
                Employee.create("과장1", "과장", 5000),
                Employee.create("과장2", "과장", 5000),
                Employee.create("부장1", "부장", 10000),
                Employee.create("부장2", "부장", 10000),
                Employee.create("부장3", "부장", 10000),
                Employee.create("이사1", "이사", 20000)};

        Employee[] findedEmployee = findByPosition("사원");

        for (Employee employee : findedEmployee) {
            employee.printInfo();
        }
    }

    private static Employee[] findByPosition(String position) {
        return Arrays.stream(employees)
                .filter(employee -> employee.equalsPosition(position))
                .toArray(Employee[]::new);
    }
}