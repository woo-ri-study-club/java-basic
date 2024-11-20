package mission7;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public int getTotalEmployees() {
        return employees.size();
    }
}
