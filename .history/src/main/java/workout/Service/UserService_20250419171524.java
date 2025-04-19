package workout.Service;

import org.springframework.stereotype.Service;

import workout.Model.User;

@Service
public class UserService {


    public User createUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User with email already exists");
        }
        return userRepository.save(user);
    }

}
