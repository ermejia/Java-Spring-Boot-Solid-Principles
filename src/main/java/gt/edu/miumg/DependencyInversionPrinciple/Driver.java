package gt.edu.miumg.DependencyInversionPrinciple;

import java.util.List;

public class Driver {

    private List<IDrive> vehicles;

    public Driver(List<IDrive> vehicles) {
        this.vehicles = vehicles;
    }

    public void moveVehicles() {
        for (IDrive vehicles : vehicles) {
            vehicles.Drive();
        }
    }
}
