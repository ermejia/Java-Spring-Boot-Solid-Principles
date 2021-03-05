package gt.edu.miumg.DependencyInversionPrinciple;

public class Driver {
    private Car car = new Car();
    private Motorcycle motorcycle = new Motorcycle();
    private Airplane airplane = new Airplane();

    public void driveVehicles (){
        car.Reverse();
        motorcycle.Drive();
        airplane.Fly();
    }
}
