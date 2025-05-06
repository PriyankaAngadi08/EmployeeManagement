import java.util.ArrayList;

public class EmployeeService {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmployee(int id, String name, String department, double salary) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            emp.setName(name);
            emp.setDepartment(department);
            emp.setSalary(salary);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            employees.remove(emp);
            return true;
        }
        return false;
    }
}
