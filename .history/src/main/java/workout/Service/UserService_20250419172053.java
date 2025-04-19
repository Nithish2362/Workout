package workout.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workout.Model.User;
import workout.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public User createUser(User user) {
        if(userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        return userRepository.save(user);
    }
}       
