package lk.ijse.gdse.main.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "therapy_sessions")
public class TherapySession {
    @Id
    private String id;

    private LocalDate appointmentDate;
    private String status;
    /*private String patientId;
    private String programId;
    private String therapistId;*/

    @ManyToOne
    @JoinColumn(name = "therapist_id")
    private Therapist therapist;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "program_id")
    private TherapyProgram therapyProgram;




}
