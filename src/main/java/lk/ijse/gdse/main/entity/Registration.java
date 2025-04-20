package lk.ijse.gdse.main.entity;

import jakarta.persistence.Id;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "registration")
public class Registration {
    @Id
    private String id;

    private LocalDate date;
    private double advancePayment;
    /*private String patientId;
    private String programId;*/

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "program_id")
    private TherapyProgram therapyProgram;

}
