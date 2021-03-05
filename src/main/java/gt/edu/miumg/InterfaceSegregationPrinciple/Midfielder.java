package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Midfielder extends SoccerTeam implements IDefend, IAttack, ICreate {
    @Override
    public void Defend() {
        System.out.println("I can defend plays against other teams!");
    }

    @Override
    public void Create() {
        System.out.println("Creating plays for the Strikers!");
    }

    @Override
    public void Attack() {
        System.out.println("I Can Strike Goals!");
    }

}
