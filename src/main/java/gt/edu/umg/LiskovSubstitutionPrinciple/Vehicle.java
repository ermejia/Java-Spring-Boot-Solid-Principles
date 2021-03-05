package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Vehicle {

    public void Parking() throws Exception {
        System.out.println("Parkin the Vehicle!");
    }

    public void Reverse() throws Exception {
        System.out.println("WARNING! Going reverse with the Vehicle!");
    }

    public void Neutral() throws Exception {
        System.out.println("NO WORRIES! Neutral Mode!");
    }

    public void Drive() throws Exception {
        System.out.println("BE CAREFUL! Im Driving!");
    }
}
