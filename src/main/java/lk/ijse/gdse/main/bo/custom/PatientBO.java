package lk.ijse.gdse.main.bo.custom;

import lk.ijse.gdse.main.bo.SuperBO;
import lk.ijse.gdse.main.dto.PatientDTO;

import java.util.List;

public interface PatientBO extends SuperBO {
    boolean savePatient(PatientDTO patientDTO);

    boolean deletePatient(String id);

    boolean updatePatient(PatientDTO patientDTO);

    List<PatientDTO> getAllPatient();

    String loadNextId();
}
