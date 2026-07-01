import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Processor Model: ");
        String model = sc.nextLine();

        Computer comp = new Computer(model);
        Computer.Processor proc = comp.new Processor();

        proc.displayDetails();

        sc.close();
    }
}