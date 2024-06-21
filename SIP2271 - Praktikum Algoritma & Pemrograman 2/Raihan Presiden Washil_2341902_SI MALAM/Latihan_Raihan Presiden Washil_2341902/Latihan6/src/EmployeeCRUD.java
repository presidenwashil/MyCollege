
import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {

    private List<Employee> employees;

    public EmployeeCRUD() {
        employees = new ArrayList<>();
    }

    // Create
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Read
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Update
    public void updateEmployee(int id, String name, int age) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setAge(age);
                break;
            }
        }
    }

    // Delete
    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
}
