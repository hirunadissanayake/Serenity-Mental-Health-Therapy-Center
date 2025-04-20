package lk.ijse.gdse.main.tm;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PatientTm {
    private String id;
    private String name;
    private String dob;
    private String gender;
    private String contact;
    private String medicalHistory;
}
