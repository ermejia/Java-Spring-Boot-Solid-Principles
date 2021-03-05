package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Driver {
    public static void pVehicle(Vehicle vehicle) throws Exception {
        vehicle.Parking();
    }

    public static void rVehicle(Vehicle vehicle) throws Exception {
        vehicle.Reverse();
    }

    public static void nVehicle(Vehicle vehicle) throws Exception {
        vehicle.Neutral();
    }

    public static void dVehicle(Vehicle vehicle) throws Exception {
        vehicle.Drive();
    }
}
