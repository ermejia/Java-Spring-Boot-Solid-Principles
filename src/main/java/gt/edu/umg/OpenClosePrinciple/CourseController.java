package gt.edu.umg.OpenClosePrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/ocp/violation")
public class CourseController {
    @GetMapping(value = "/")
    public ResponseEntity ocp(HttpServletRequest request) {
        System.out.println("------------------------OCP VIOLATION------------------------");
        System.out.println("College Requirement:" + Course.course("math"));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + Course.course("language"));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + Course.course("science"));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + Course.course("history"));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + Course.course("domotic"));
        System.out.println("-------------------------------------------------------------");
        return new ResponseEntity("Look at your IDE Console", HttpStatus.OK);
    }
}
