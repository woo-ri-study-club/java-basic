package mission01;

import java.util.Scanner;

public class AdvancedEx {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("이하정", "사장", 9000),
                new Employee("이영훈", "팀장", 8000),
                new Employee("김영화", "대리", 6000),
                new Employee("박나영", "대리", 6000),
                new Employee("최진영", "사원", 4000),
                new Employee("김희찬", "사원", 4000),
                new Employee("장하나", "사원", 3000)
        };

        String inputPosition = readPositionFromUser();
        displayEmployeesByPosition(inputPosition, employees);
    }

    private static String readPositionFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("직책(사장, 부장, 팀장, 대리, 사원)을 입력하세요 : ");
        String inputPosition = scanner.nextLine().trim();
        return inputPosition;
    }

    private static void displayEmployeesByPosition(String inputPosition, Employee[] employees) {

        Employee[] foundEmployees = findByPosition(inputPosition, employees);

        if (foundEmployees.length == 0) {
            System.out.println("입력한 직책의 직원이 없습니다.");
            return;
        }

        for (Employee foundEmployee : foundEmployees) {
            System.out.println("이름: " + foundEmployee.getName() + ", 연봉: " + foundEmployee.getSalary());
        }
    }

    public static Employee[] findByPosition(String position, Employee[] employees) {

        Employee[] temp = new Employee[employees.length];
        int count = 0;

        for (Employee employee : employees) {
            if (employee.getPosition().equals(position)) {
                temp[count++] = employee;
            }
        }
        Employee[] result = new Employee[count];
        System.arraycopy(temp, 0, result, 0, count);

        return result;
    }
}