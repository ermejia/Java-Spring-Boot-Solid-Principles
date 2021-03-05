package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Defender extends SoccerTeam implements ICreate, IAttack, IDefend{
    @Override
    public void Defend() { System.out.println("Defending the sheet against other Players!"); }

    @Override
    public void Create() {
        System.out.println("Creating plays for the Strikers!");
    }

    @Override
    public void Attack() {
        System.out.println("I can score goals on Corners!");
    }

}
