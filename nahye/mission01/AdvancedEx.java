package mission01;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedEx {
    private Employee[] employees = {
            new Employee("이하정", "사장", 9000),
            new Employee("이영훈", "팀장", 8000),
            new Employee("김영화", "대리", 6000),
            new Employee("박나영", "대리", 6000),
            new Employee("최진영", "사원", 4000),
            new Employee("김희찬", "사원", 4000),
            new Employee("장하나", "사원", 3000)
    };

    public static void main(String[] args) {

        AdvancedEx advancedEx = new AdvancedEx();

        Scanner scanner = new Scanner(System.in);
        System.out.print("직책(사장, 부장, 팀장, 대리, 사원)을 입력하세요 : ");
        String inputPosition = scanner.nextLine().trim();

        Employee[] foundEmployees = advancedEx.findByPosition(inputPosition);

        if (foundEmployees.length == 0) {
            System.out.println("입력한 직책의 직원이 없습니다.");
        }
        for (Employee foundEmployee : foundEmployees) {
            if (foundEmployee != null) {
                System.out.println("이름: " + foundEmployee.getName() + ", 연봉: " + foundEmployee.getSalary());
            }
        }

    }

    public Employee[] findByPosition(String position) {
        Employee[] result = new Employee[employees.length];
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPosition().equals(position)) {
                result[count] = employees[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
