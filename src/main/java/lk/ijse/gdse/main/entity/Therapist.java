package lk.ijse.gdse.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "therapist")
public class Therapist {
    @Id
    private String id;

    private String name;
    private String contact;
    /*private String pro_id;*/

    @ManyToOne
    @JoinColumn(name = "program_id")
    private TherapyProgram therapyProgram;

}
