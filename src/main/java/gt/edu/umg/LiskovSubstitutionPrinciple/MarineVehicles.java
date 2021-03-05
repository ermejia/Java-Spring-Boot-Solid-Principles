package gt.edu.umg.LiskovSubstitutionPrinciple;

public class MarineVehicles extends Vehicle{
    public void Parking() { System.out.println("Parkin Marine Vehicle!"); }

    public void Reverse() { System.out.println("WARNING! Going reverse with Marine Vehicle!"); }

    public void Neutral() {
        System.out.println("NO WORRIES! Marine Vehicle in Neutral Mode!");
    }

    public void Drive() { System.out.println("BE CAREFUL! Marine Vehicle Moving!"); }
}
