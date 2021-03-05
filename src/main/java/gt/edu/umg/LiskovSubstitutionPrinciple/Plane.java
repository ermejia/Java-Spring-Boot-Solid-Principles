package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Plane extends AirVehicles{
    @Override
    public void Parking() {
        System.out.println("The plane is being parked!");
    }

    @Override
    public void Reverse() { System.out.println("The plane has no reverse!"); }
    @Override
    public void Neutral() {
        System.out.println("The plane is waiting for a driver!");
    }

    @Override
    public void Drive() { System.out.println("The plane is not handled, the plane is planned! Flying!"); }
}
