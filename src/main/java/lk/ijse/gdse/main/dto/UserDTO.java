package lk.ijse.gdse.main.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private String username;
    private String password;
    private String email;
    private String role;
    private String adminName;
    private String adminCode;

    public UserDTO(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
