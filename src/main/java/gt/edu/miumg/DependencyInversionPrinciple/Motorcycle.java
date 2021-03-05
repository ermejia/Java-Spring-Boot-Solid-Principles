package gt.edu.miumg.DependencyInversionPrinciple;

public class Motorcycle implements IDrive{
    private String name;

    @Override
    public void Drive() {
        this.Drives();
    }

    public Motorcycle(String name){
        this.name = name;
    }

    private void Drives(){
        System.out.println(String.format("The %s is being driven", this.name));
    }
}
