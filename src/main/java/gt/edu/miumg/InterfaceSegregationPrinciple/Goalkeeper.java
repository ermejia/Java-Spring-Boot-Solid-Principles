package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Goalkeeper extends SoccerTeam {
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
        System.out.println("I can score goals at min. 90 in a corner!");
    }

    @Override
    public void CleanSheet() {
        System.out.println("I am Defending my sheet!");
    }
}
