package mission1;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees){
        this.employees = employees;
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public void findByPosition(String position){
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) {
                System.out.println("이름: " + employee.getName() + ", 직책: " + employee.getPosition() + ", 급여: " + employee.getSalary());
            }
        }
    }
}
