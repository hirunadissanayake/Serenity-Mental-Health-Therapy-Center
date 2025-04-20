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
@Table(name = "payment")
public class Payment {
    @Id
    private String id;

    private LocalDate date;
    private double amount;
    private String type;
    private String status;
    /*private String session_id;*/

    @OneToOne
    @JoinColumn(name = "session_id")
    private TherapySession therapySession;


}
