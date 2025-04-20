package lk.ijse.gdse.main.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    private String id;

    private String name;
    private String dob;
    private String gender;
    private String contact;
    private String medicalHistory;

    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    private List<Registration> registrations;

    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    private List<TherapySession> therapySessions;

    public Patient(String id,String name, String dob, String gender, String contact, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.contact = contact;
        this.medicalHistory = medicalHistory;
    }
}
