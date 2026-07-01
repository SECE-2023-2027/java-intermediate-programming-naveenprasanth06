import java.util.Scanner;

abstract class Appliance {
    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Appliance is now powered on.");
    }

    public abstract void makeWork();
}