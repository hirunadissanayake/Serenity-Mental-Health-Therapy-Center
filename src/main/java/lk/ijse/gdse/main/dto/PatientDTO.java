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

    public PatientDTO(String name, String dob, String gender, String contact, String medicalHistory) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.contact = contact;
        this.medicalHistory = medicalHistory;
    }
}
