import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Circle Radius:");
        double radius = sc.nextDouble();

        System.out.println("Enter Rectangle Length and Width:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        System.out.println("Enter Square Side:");
        int side = sc.nextInt();

        System.out.println("Circle Area: " + AreaCalculator.calculateArea(radius));
        System.out.println("Rectangle Area: " + AreaCalculator.calculateArea(length, width));
        System.out.println("Square Area: " + AreaCalculator.calculateArea(side));

        sc.close();
    }
}