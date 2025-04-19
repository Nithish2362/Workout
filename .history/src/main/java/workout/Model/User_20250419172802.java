package workout.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")  // 👈 keyword-safe
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 👈 auto-increment
    private Long id;

    private String name;
    private String username;
    private String password;
    private String email;
}
