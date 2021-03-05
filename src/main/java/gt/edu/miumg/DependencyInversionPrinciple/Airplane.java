package gt.edu.miumg.DependencyInversionPrinciple;

public class Airplane implements IDrive{
    private String name;

    @Override
    public void Drive() {
        this.Fly();
    }

    public Airplane(String name){
        this.name = name;
    }

    private void Fly(){
        System.out.println(String.format("The %s is Flying", this.name));
    }
}
