/*
[미니 프로젝트] 회사의 직원(Employee) 정보를 관리하는 프로그램을 만들어 보세요.

Employee 클래스는 name, position, salary 속성을 가져야 하며, 생성자와 각 속성을 반환하는 메서드를 포함해야 합니다.
이 프로그램은 Employee 객체 배열을 사용하여 여러 직원 정보를 저장하고, 특정 직책의 직원 정보만 필터링하여 출력하는 기능을 제공해야 합니다.
특정 직책을 입력 받아 해당 직책을 가진 모든 직원의 정보를 출력하는 findByPosition(String position) 메서드를 구현하세요.
 */
package section2.mission3;


public class Mission3 {

    public static void main(String[] args) {

        Employee[] employeeArr = {
                new Employee("이지원자", "백엔드", 3000),
                new Employee("최지원자", "백엔드", 3500),
                new Employee("박지원자", "프론트엔드", 4000),
                new Employee("예지원자", "프론트엔드", 4500),
                new Employee("윤지원자", "데브옵스", 5000),
                new Employee("김지원자", "데브옵스", 5500)
        };

        //Employee들 관련 기능을 가지는 EmployeeService
        Employees employees = new Employees(employeeArr);

        employees.findByPosition("데브옵스");

    }
}
