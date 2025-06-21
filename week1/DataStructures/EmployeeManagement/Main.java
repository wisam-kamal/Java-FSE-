public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E101", "Wisam", "Manager", 75000));
        manager.addEmployee(new Employee("E102", "Kamal", "Developer", 60000));
        manager.addEmployee(new Employee("E103", "Ram", "Tester", 50000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for E102:");
        Employee e = manager.searchEmployee("E102");
        System.out.println(e != null ? e : "Not Found");

        System.out.println("\nDeleting E102...");
        manager.deleteEmployee("E102");

        System.out.println("\nAfter Deletion:");
        manager.traverseEmployees();
    }
}
