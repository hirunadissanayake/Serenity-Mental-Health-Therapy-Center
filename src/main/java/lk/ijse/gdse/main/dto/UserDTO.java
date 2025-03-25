package lk.ijse.gdse.main.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
