package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Boat extends Vehicle{
    @Override
    public void Parking() { System.out.println("The boat is being parked!"); }

    @Override
    public void Reverse() {
        System.out.println("The boat is being moved slow!");
    }

    @Override
    public void Neutral() {
        System.out.println("The boat is waiting for a driver!");
    }

    @Override
    public void Drive() {
        System.out.println("The boat is being driven!");
    }
}
