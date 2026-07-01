import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        Appliance app = new WashingMachine(brand);

        app.turnOn();
        app.makeWork();

        sc.close();
    }
}