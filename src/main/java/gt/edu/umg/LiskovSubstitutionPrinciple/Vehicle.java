package gt.edu.umg.LiskovSubstitutionPrinciple;

public class Vehicle {

    public void Parking() { System.out.println("Parking the Vehicle!"); }

    public void Reverse() { System.out.println("WARNING! Going reverse with the Vehicle!"); }

    public void Neutral() {
        System.out.println("NO WORRIES! Neutral Mode!");
    }

    public void Drive() { System.out.println("BE CAREFUL! Im Driving!"); }
}
