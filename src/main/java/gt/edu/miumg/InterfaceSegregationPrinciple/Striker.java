package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Striker extends SoccerTeam{
    @Override
    public void DefendPlays() {
        System.out.println("I can only score goals, not defend!");
    }

    @Override
    public void CreatePlays() {
        System.out.println("Creating plays to Score Goals!");
    }

    @Override
    public void ScoreGoals() {
        System.out.println("I Can Strike Goals!");
    }

    @Override
    public void CleanSheet() throws Exception {
        throw new Exception("I am not a GoalKeeper!");
    }
}
