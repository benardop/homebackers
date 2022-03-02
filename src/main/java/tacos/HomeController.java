package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Controller annotation Identify this class as a component
 * for component scanning
 */
@Controller
public class HomeController {

    //handles the HTTP GET requests received for root'/' path
    @GetMapping("/")
    public String homePage() {
        return "home"; //"home" is interpreted as the logical name of the view
    }

}
