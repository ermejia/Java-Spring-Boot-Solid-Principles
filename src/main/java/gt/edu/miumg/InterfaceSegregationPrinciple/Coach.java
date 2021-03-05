package gt.edu.miumg.InterfaceSegregationPrinciple;

public class Coach {
    public static void makePlayerDefend(IDefend player) throws Exception {
        player.Defend();
    }

    public static void makePlayerAttack(IAttack player) throws Exception {
        player.Attack();
    }

    public static void makePlayerCreate(ICreate player) throws Exception {
        player.Create();
    }

    public static void cleanSheetGoalkeeper(ICleanSheet player) throws Exception {
        player.Clean();
    }
}
