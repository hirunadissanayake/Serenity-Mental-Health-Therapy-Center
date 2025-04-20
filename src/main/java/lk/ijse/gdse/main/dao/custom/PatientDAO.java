package lk.ijse.gdse.main.dao.custom;

import lk.ijse.gdse.main.dao.SuperDAO;
import lk.ijse.gdse.main.dto.PatientDTO;
import lk.ijse.gdse.main.entity.Patient;

import java.util.List;

public interface PatientDAO extends SuperDAO {
    boolean save(Patient patient);

    boolean delete(String id);

    boolean update(Patient patient);

    List<Patient> getAll();
}
