import java.util.Scanner;

public class EmployeeView {
    private Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n---- Employee Management System ----");
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Search Employee by ID");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public Employee getEmployeeDetails() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        return new Employee(id, name, department, salary);
    }

    public int getEmployeeId() {
        System.out.print("Enter Employee ID: ");
        return sc.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayEmployee(Employee emp) {
        if (emp != null) {
            emp.display();
        } else {
            System.out.println("Employee not found.");
        }
    }

    public String getUpdatedName() {
        sc.nextLine(); // consume newline
        System.out.print("Enter new Name: ");
        return sc.nextLine();
    }

    public String getUpdatedDepartment() {
        System.out.print("Enter new Department: ");
        return sc.nextLine();
    }

    public double getUpdatedSalary() {
        System.out.print("Enter new Salary: ");
        return sc.nextDouble();
    }
}
