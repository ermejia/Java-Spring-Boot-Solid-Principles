package gt.edu.umg.OpenClosePrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ocp/solution")
public class CourseController {
    @GetMapping(value = "/")
    public ResponseEntity ocp(HttpServletRequest request) {
        System.out.println("------------------------OCP VIOLATION------------------------");
        System.out.println("College Requirement:" + CourseManager.course(new MathCourse()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + CourseManager.course(new LanguageCourse()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + CourseManager.course(new ScienceCourse()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + CourseManager.course(new HistoryCourse()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("College Requirement:" + CourseManager.course(new DomoticCourse()));
        System.out.println("-------------------------------------------------------------");
        return new ResponseEntity("Look at your IDE Console", HttpStatus.OK);
    }
}
