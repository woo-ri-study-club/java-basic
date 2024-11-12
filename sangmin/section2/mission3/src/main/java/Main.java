public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee(Employee.create("사원1", "사원", 2000));
        employees.addEmployee(Employee.create("사원2", "사원", 2000));
        employees.addEmployee(Employee.create("사원3", "사원", 2000));
        employees.addEmployee(Employee.create("대리1", "대리", 3000));
        employees.addEmployee(Employee.create("대리2", "대리", 3000));
        employees.addEmployee(Employee.create("과장1", "과장", 5000));
        employees.addEmployee(Employee.create("과장2", "과장", 5000));
        employees.addEmployee(Employee.create("부장1", "부장", 10000));
        employees.addEmployee(Employee.create("부장2", "부장", 10000));
        employees.addEmployee(Employee.create("부장3", "부장", 10000));
        employees.addEmployee(Employee.create("이사1", "이사", 20000));
        
        employees.findPosition("사원");
    }
}
