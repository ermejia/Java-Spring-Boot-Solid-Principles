package gt.edu.umg.SingleResponsibilityPrinciple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/solution")
public class BookController {

    @GetMapping(value = "/")
    public ResponseEntity CarSrp(HttpServletRequest request) {

        IPrinter printer = new BookPrinter();
        printer.printValue("***************Solution Example (SRP)***************");

        Book book = new Book();
        book.setName("EL RELATO DE UN NAÚFRAGO");
        book.setAuthor("Gabriel García Márquez");
        book.setDescription("Relata la vida de un naúfrago");

        printer.printValue(book.getName());
        printer.printValue(book.getAuthor());
        printer.printValue(book.getDescription());

        return new ResponseEntity("Look Your Program Console", HttpStatus.OK);
    }
}