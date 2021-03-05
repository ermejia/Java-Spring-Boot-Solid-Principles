package gt.edu.umg.LiskovSubstitutionPrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/solution/lsp")
public class VehicleController {

    @GetMapping(value = "/")
    public ResponseEntity lsp(HttpServletRequest request) throws Exception {
        System.out.println("**********LSP VIOLATION**********");
        System.out.println("---------------------------------------------------------");
        System.out.println("------------------------Car Speeds-----------------------");
        Driver.pVehicle(new Car());
        Driver.rVehicle(new Car());
        Driver.nVehicle(new Car());
        Driver.dVehicle(new Car());
        System.out.println("---------------------------------------------------------");
        System.out.println("--------------------Motorcycle Speeds--------------------");
        Driver.pVehicle(new Motorcycle());
        Driver.rVehicle(new Motorcycle());
        Driver.nVehicle(new Motorcycle());
        Driver.dVehicle(new Motorcycle());
        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------Plane Speeds-----------------------");
        Driver.pVehicle(new Plane());
        Driver.rVehicle(new Plane());
        Driver.nVehicle(new Plane());
        Driver.dVehicle(new Plane());
        System.out.println("---------------------------------------------------------");
        System.out.println("-----------------------Boat Speeds-----------------------");
        Driver.pVehicle(new Boat());
        Driver.rVehicle(new Boat());
        Driver.nVehicle(new Boat());
        Driver.dVehicle(new Boat());
        System.out.println("---------------------------------------------------------");
        return new ResponseEntity("Look at Your IDE Console", HttpStatus.OK);
    }
}
