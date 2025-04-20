package lk.ijse.gdse.main.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lk.ijse.gdse.main.entity.TherapySession;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private String id;
    private LocalDate date;
    private double amount;
    private String type;
    private String status;
    private String session_id;

}
