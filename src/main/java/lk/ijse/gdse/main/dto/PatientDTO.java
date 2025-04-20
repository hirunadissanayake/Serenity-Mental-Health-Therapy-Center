package lk.ijse.gdse.main.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    private String id;
    private String name;
    private String dob;
    private String gender;
    private String contact;
    private String medicalHistory;
}
