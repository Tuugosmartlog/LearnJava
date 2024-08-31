import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<Vehicle> vehicles = new ArrayList<>();
    public void addVehicle (Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void displayAllVehicles(){
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            vehicle.displayInfo();
        }

    }
    public double getTotalValue(){
        double s = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            s = s + vehicle.getPrice();
        }
        return s;
    }

}
