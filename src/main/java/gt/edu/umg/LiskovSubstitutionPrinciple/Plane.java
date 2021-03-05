package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Plane extends Vehicle{
    @Override
    public void Parking() {
        System.out.println("The plane is being parked!");
    }

    @Override
    public void Reverse() throws Exception{
        throw new Exception("The plane has no reverse!");
    }

    @Override
    public void Neutral() {
        System.out.println("The plane is waiting for a driver!");
    }

    @Override
    public void Drive() throws Exception{
        throw new Exception("The plane is not handled, the plane is planned! Flying!");
    }
}
