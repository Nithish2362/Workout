package workout.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import workout.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    
}
