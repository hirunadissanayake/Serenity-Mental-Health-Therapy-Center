package lk.ijse.gdse.main.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TherapySessionDTO {
    private String id;
    private LocalDate appointmentDate;
    private String status;
    private String patientId;
    private String programId;
    private String therapistId;
}
