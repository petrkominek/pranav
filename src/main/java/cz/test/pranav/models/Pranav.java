package cz.test.pranav.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(	name = "pranav")
public class Pranav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    public Pranav() {
    }

    public Pranav(String username, String email) {
        this.username = username;
        this.email = email;
    }

    private String email;

}
