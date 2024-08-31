//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("thu", " mthu", 2002, 212, 202, "thu1612");
        Truck truck = new Truck("thu", " mthu", 2002, 12.6, 123, 1234566);
        garage.addVehicle(car);
        garage.addVehicle(truck);
        garage.displayAllVehicles();
        double totalPrice = garage.getTotalValue();
        System.out.println(totalPrice);

    }
}