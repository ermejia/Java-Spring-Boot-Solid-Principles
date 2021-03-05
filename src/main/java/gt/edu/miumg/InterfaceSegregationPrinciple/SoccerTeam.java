package gt.edu.miumg.InterfaceSegregationPrinciple;

public class SoccerTeam implements ISoccerTeamPlays{
    @Override
    public void CreatePlays() {
        System.out.println("We are Creating Game!!");
    }

    @Override
    public void DefendPlays() {
        System.out.println("We are Defending Plays!!");
    }

    @Override
    public void ScoreGoals() {
        System.out.println("We are Scoring Goals");
    }

    @Override
    public void CleanSheet() throws Exception {
        System.out.println("The Goalkeeper keeps a clean sheet");
    }
}
