package workout.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import workout.Model.User;
import workout.Service.UserService;

@RestController
public class UserController {
    private final UserService userService;

     @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
}
