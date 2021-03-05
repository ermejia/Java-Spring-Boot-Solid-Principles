package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Striker extends SoccerTeam implements IDefend, IAttack, ICreate{
    @Override
    public void Defend() {
        System.out.println("I can only score goals, not defend!");
    }

    @Override
    public void Create() {
        System.out.println("Creating plays to Score Goals!");
    }

    @Override
    public void Attack() {
        System.out.println("I Can Strike Goals!");
    }

}
