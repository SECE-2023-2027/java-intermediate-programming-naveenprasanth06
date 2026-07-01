public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 3000);
        Manager mgr = new Manager("Charlie", 5000, 1500);

        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());
    }
}