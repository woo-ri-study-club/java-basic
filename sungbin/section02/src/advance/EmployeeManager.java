package advance;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("양성빈", "개발자", 10000000),
                new Employee("신짱구", "PM", 9000000),
                new Employee("김철수", "개발자", 9000000),
                new Employee("이영희", "데이터 분석가", 8000000),
                new Employee("이훈이", "PM", 7000000),
        };

        findByPosition(employees, "개발자");
    }

    public static void findByPosition(Employee[] employees, String position) {
        System.out.println("'" + position + "'" + "직급을 가진 직원 리스트 출력");
        for (Employee employee : employees) {
            if (employee.isPosition(position)) {
                System.out.println(employee);
            }
        }
    }
}
