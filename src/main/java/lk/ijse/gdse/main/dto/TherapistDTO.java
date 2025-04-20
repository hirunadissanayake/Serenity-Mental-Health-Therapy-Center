package lk.ijse.gdse.main.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.gdse.main.entity.TherapyProgram;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TherapistDTO {
    private String id;
    private String name;
    private String contact;
    private String pro_id;


}
