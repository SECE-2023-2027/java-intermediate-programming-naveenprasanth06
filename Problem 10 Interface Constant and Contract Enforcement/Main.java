import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Value: ");
        double itemValue = sc.nextDouble();

        TaxRules system = new BillingSystem();

        System.out.println(system.calculateTax(itemValue));

        sc.close();
    }
}