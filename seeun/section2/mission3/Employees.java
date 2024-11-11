package section2.mission3;

public class Employees {

    private final Employee[] employees;

    public Employees(Employee[] employees) {
        this.employees = employees;
    }

    // 배열을 이용해 특정 position에 해당하는 요소 찾기
    public Employee[] findByPosition(String position) {
        Employee[] result = new Employee[2];
        int i=0;

        for (Employee employee : employees) {
            if (employee.isPosition(position)) {
                result[i++] = employee;
            }
        }
        return result;
    }

/*
    // List를 이용해 특정 position에 해당하는 요소 찾기
    public List<Employee> findByPosition(String position) {
        ArrayList<Employee> findEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.isPosition(position)) {
                findEmployees.add(employee);
            }
        }
        return findEmployees;
    }
 */
}
