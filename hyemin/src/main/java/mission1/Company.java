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
            if (employee.isPosition(position)) {
                System.out.println(employee);
            }
        }
    }
}
