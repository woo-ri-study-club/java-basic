package mission01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvancedEx {
    static Employee[] employees = {
            new Employee("이하정", "사장", 9000),
            new Employee("이영훈", "팀장", 8000),
            new Employee("김영화", "대리", 6000),
            new Employee("박나영", "대리", 6000),
            new Employee("최진영", "사원", 4000),
            new Employee("김희찬", "사원", 4000),
            new Employee("장하나", "사원", 3000)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("직책(사장, 부장, 팀장, 대리, 사원)을 입력하세요 : ");
        String inputPosition = scanner.nextLine().trim();

        List<Employee> foundEmployees = findByPosition(inputPosition);

        if (foundEmployees.isEmpty()) {
            System.out.println("입력한 직책의 직원은 없습니다.");
        } else {
            for (Employee employee : foundEmployees) {
                System.out.println("이름: " + employee.getName() + ", 연봉: " + employee.getSalary());
            }
        }

    }

    public static List<Employee> findByPosition(String position) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition().equals(position)) {
                result.add(employee);
            }
        }
        return result;
    }
}
