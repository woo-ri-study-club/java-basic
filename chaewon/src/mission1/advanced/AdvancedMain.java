package mission1.advanced;

public class AdvancedMain {
    public static void main(String[] args) {
        Employee[] employees = {
                Employee.of("직원A", "STAFF", 260),
                Employee.of("직원B", "STAFF", 300),
                Employee.of("직원C", "MANAGER", 350),
                Employee.of("직원D", "STAFF", 280),
                Employee.of("직원E", "MANAGER", 380),
                Employee.of("CEO", "CEO", 1000)
        };

        Corporation corporation = Corporation.of(employees);

        corporation.findByPosition("STAFF");
    }
}
