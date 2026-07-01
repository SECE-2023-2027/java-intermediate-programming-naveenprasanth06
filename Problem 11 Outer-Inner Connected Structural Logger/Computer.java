public class Computer {
    private String processorModel;

    public Computer(String processorModel) {
        this.processorModel = processorModel;
    }

    public class Processor {
        public void displayDetails() {
            System.out.println("Processor Model: " + processorModel);
        }
    }
}