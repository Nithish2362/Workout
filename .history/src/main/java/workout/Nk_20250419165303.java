package workout;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Nk {
    public String hello() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Hello";
    
        
    }

    
}
