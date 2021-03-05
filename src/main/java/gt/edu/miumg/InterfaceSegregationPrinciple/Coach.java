package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Coach {
    public static void makePlayerDefend(SoccerTeam player) throws Exception {
        player.DefendPlays();
    }

    public static void makePlayerAttack(SoccerTeam player) throws Exception {
        player.ScoreGoals();
    }

    public static void makePlayerCreate(SoccerTeam player) throws Exception {
        player.CreatePlays();
    }

    public static void cleanSheetGoalkeeper(SoccerTeam player) throws Exception {
        player.CleanSheet();
    }
}
