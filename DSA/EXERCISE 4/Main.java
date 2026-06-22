public class Main {

    public static void main(String[] args) {

        EmployeeManagement em =
                new EmployeeManagement();

        em.addEmployee(
                new Employee(
                        101,
                        "Hari",
                        "Developer",
                        50000));

        em.addEmployee(
                new Employee(
                        102,
                        "Ravi",
                        "Tester",
                        40000));

        em.addEmployee(
                new Employee(
                        103,
                        "John",
                        "Manager",
                        70000));

        System.out.println(
                "\nEmployees:");

        em.displayEmployees();

        System.out.println(
                "\nSearch:");

        em.searchEmployee(102);

        System.out.println(
                "\nDelete:");

        em.deleteEmployee(102);

        System.out.println(
                "\nAfter Delete:");

        em.displayEmployees();
    }
}