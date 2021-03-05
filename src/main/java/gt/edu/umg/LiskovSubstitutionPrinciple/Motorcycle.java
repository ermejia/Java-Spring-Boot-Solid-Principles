package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Motorcycle extends Vehicle{
    @Override
    public void Parking() {
        System.out.println("The motorcycle is being parked!");
    }

    @Override
    public void Reverse() throws Exception{ throw new Exception("The bike has no reverse! "); }

    @Override
    public void Neutral() {
        System.out.println("The bike is waiting for a driver!");
    }

    @Override
    public void Drive() {
        System.out.println("The bike is being driven!");
    }
}
