package workout;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Nk {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    
        
    }

    
}
