package workout.Service;

import org.springframework.stereotype.Service;

import workout.Model.User;
import workout.Repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;


    public User createUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User with email already exists");
        }
        return userRepository.save(user);
    }

}
