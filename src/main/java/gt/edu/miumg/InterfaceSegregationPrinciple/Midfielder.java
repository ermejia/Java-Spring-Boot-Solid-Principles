package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Midfielder extends SoccerTeam{
    @Override
    public void DefendPlays() {
        System.out.println("I can defend plays against other teams!");
    }

    @Override
    public void CreatePlays() {
        System.out.println("Creating plays for the Strikers!");
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
