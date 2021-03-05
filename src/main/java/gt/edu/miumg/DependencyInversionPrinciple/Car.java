package gt.edu.miumg.DependencyInversionPrinciple;

public class Car implements IDrive{
    private String name;

    @Override
    public void Drive() {
        this.Reverse();
    }

    public Car(String name){
        this.name = name;
    }

    private void Reverse(){
        System.out.println(String.format("The %s is backing up", this.name));
    }
}
