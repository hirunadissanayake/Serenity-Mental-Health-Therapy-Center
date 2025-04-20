package lk.ijse.gdse.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    @Column(nullable = false)
    private String role;


}
