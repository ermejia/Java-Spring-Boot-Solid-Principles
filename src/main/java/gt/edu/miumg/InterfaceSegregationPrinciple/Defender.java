package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Defender extends SoccerTeam{
    @Override
    public void DefendPlays() {
        System.out.println("Defending the sheet against other Players!");
    }

    @Override
    public void CreatePlays() {
        System.out.println("Creating plays for the Strikers!");
    }

    @Override
    public void ScoreGoals() {
        System.out.println("I can score goals on Corners!");
    }

    @Override
    public void CleanSheet() throws Exception {
        throw new Exception("I am not a GoalKeeper!");
    }

}
