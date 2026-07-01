import java.util.Scanner;
class WashingMachine extends Appliance {

    WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void makeWork() {
        System.out.println("Washing machine is washing clothes.");
    }
}