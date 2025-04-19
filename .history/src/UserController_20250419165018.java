

@RestController
public class UserController {

    @RequestMapping("/users")
    public String getAllUsers() {
        return "Hello World";
    }


    
}
