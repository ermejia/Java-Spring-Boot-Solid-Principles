package gt.edu.miumg.InterfaceSegregationPrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/solution/isp")
public class SoccerTeamController {

    @GetMapping(value = "/")
    public ResponseEntity isp(HttpServletRequest request) throws Exception {
        System.out.println("*****************************ISP SOLUTION**************************");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("--------------------------Defender Skills--------------------------");
        Coach.makePlayerDefend(new Defender());
        Coach.makePlayerAttack(new Defender());
        Coach.makePlayerCreate(new Defender());
        System.out.println("-------------------------Midfielder Skills-------------------------");
        Coach.makePlayerDefend(new Midfielder());
        Coach.makePlayerAttack(new Midfielder());
        Coach.makePlayerCreate(new Midfielder());
        System.out.println("----------------------------Striker Skills-------------------------");
        Coach.makePlayerDefend(new Striker());
        Coach.makePlayerAttack(new Striker());
        Coach.makePlayerCreate(new Striker());
        System.out.println("--------------------------GoalKeeper Skills------------------------");
        Coach.makePlayerDefend(new Goalkeeper());
        Coach.makePlayerAttack(new Goalkeeper());
        Coach.makePlayerCreate(new Goalkeeper());
        Coach.cleanSheetGoalkeeper(new Goalkeeper());
        System.out.println("-------------------------------------------------------------------");
        return new ResponseEntity("Look at Your IDE Console", HttpStatus.OK);
    }
}
