package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Car extends LandVehicles{
    @Override
    public void Parking() {
        System.out.println("The car is being parked!");
    }

    @Override
    public void Reverse() {
        System.out.println("The car is being moved!");
    }

    @Override
    public void Neutral() {
        System.out.println("The car is waiting for a driver!");
    }

    @Override
    public void Drive() {
        System.out.println("The car is being driven!");
    }
}
