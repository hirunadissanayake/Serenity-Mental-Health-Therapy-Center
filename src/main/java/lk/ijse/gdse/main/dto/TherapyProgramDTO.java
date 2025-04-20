package lk.ijse.gdse.main.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TherapyProgramDTO {
    private String id;
    private String name;
    private String duration;
    private double fee;
}
