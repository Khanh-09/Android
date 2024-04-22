import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "ho thi a", 27, "phong 4", "E1", 3000.0));
        employees.add(new Employee(2, "ho thi b", 25, "phong 2", "E2", 2800.0));
        employees.add(new Employee(3, "ho thi c", 21, "phong 1", "E3", 3200.0));
        employees.add(new Employee(4, "ho thi d", 28, "phong 3", "E4", 3100.0));
        employees.add(new Employee(5, "ho thi e", 22, "phong 1", "E5", 2900.0));
        employees.add(new Employee(6, "ho thi f", 27, "phong 5", "E6", 2700.0));
        employees.add(new Employee(7, "ho thi g", 25, "phong 2", "E7", 3300.0));
        employees.add(new Employee(8, "ho thi h", 20, "phong 2", "E8", 2600.0));
        employees.add(new Employee(9, "ho thi i", 26, "phong 5", "E9", 3400.0));
        employees.add(new Employee(10, "ho thi j", 26, "phong 3", "E10", 3000.0));

        displayEmployees(employees);
        addEmployee(scanner, employees);
        removeEmployees(scanner, employees);
        scanner.close();
    }
    // Display list of employees
    private static void displayEmployees(List<Employee> employees) {
        System.out.println("List of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Add a new employee
    private static void addEmployee(Scanner scanner, List<Employee> employees) {
        System.out.println("\nEnter details of new employee:");
        System.out.print("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();

        employees.add(new Employee(id, name, age, department, code, salaryRate));
        System.out.println("Employee added successfully.");
    }
    
    // Remove a new employee
    private static void removeEmployees(Scanner scanner, List<Employee> employees) {
        System.out.println("\nEnter the ID of the employee to remove:");
        int removeId = scanner.nextInt();
        boolean removed = false;
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == removeId) {
                iterator.remove();
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Employee removed successfully.");
            displayEmployees(employees);
        } else {
            System.out.println("Employee not found.");
        }
    }
}
    
     