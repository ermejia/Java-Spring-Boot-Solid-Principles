package gt.edu.miumg.DependencyInversionPrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/solution/dip")

public class VehicleController {
    @GetMapping(value = "/")
    public ResponseEntity dip(HttpServletRequest request) throws Exception{
        List<IDrive> vehicles = new ArrayList<>();

        Car ford = new Car("Ford Ranger");
        Car izuzu = new Car("D-Max");

        Motorcycle yamaha = new Motorcycle("Yamaha Crux");
        Motorcycle honda = new Motorcycle("Honda Navy");

        Airplane boeing = new Airplane("Boeing 747");
        Airplane airbus = new Airplane("Airbus A330");

        System.out.println("----------------------Vehicles Moving-----------------------");
        System.out.println("----------------------------Cars----------------------------");
        vehicles.add(ford);
        vehicles.add(izuzu);
        System.out.println("------------------------------------------------------------");
        System.out.println("----------------------------Bikes---------------------------");
        vehicles.add(yamaha);
        vehicles.add(honda);
        System.out.println("------------------------------------------------------------");
        System.out.println("----------------------------Planes--------------------------");
        vehicles.add(boeing);
        vehicles.add(airbus);
        System.out.println("------------------------------------------------------------");

        Driver driver = new Driver(vehicles);

        driver.moveVehicles();
        return new ResponseEntity("Look at Your IDE Console", HttpStatus.OK);
    }
}

