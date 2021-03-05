package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Goalkeeper extends SoccerTeam implements IDefend, IAttack, ICreate, ICleanSheet {
    @Override
    public void Defend() {
        System.out.println("Defending the sheet against other Players!");
    }

    @Override
    public void Create() {
        System.out.println("Creating plays for the Strikers!");
    }

    @Override
    public void Attack() {
        System.out.println("I can score goals at min. 90 in a corner!");
    }

    @Override
    public void Clean() {
        System.out.println("I am Defending my sheet!");
    }
}
