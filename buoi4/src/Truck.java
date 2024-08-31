public class Truck extends Vehicle{
    private double loadCapacity;
    private int numberOfAxles;

    public Truck() {
    }

    public Truck(double loadCapacity, int numberOfAxles) {
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public Truck(String brand, String model, int year, double price, double loadCapacity, int numberOfAxles) {
        super(brand, model, year, price);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(loadCapacity);
        System.out.println(numberOfAxles);

    }
}
