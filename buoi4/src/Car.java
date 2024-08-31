public class Car extends Vehicle  {
    private int numberOfDoors;
    private String fuelType;

    public Car() {
    }

    public Car(int numberOfDoors, String fuelType) {
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public Car(String brand, String model, int year, double price, int numberOfDoors, String fuelType) {
        super(brand, model, year, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(numberOfDoors);
        System.out.println(fuelType);
    }

}
