package gt.edu.miumg.DependencyInversionPrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/violation/dip")
public class VehicleController {
    @GetMapping(value = "/")
    public ResponseEntity dip(HttpServletRequest request) throws Exception{

        Driver driver = new Driver();

        driver.driveVehicles();

        return new ResponseEntity("Look at Your IDE Console", HttpStatus.OK);
    }
}
