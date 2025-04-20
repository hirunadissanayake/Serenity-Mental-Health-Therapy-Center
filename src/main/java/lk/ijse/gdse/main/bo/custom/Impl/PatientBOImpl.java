package lk.ijse.gdse.main.bo.custom.Impl;

import lk.ijse.gdse.main.bo.custom.PatientBO;
import lk.ijse.gdse.main.dao.DAOFactory;
import lk.ijse.gdse.main.dao.custom.PatientDAO;
import lk.ijse.gdse.main.dto.PatientDTO;
import lk.ijse.gdse.main.entity.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientBOImpl implements PatientBO {

    PatientDAO patientDAO = (PatientDAO) DAOFactory.getInstance().getDAO(DAOFactory.type.PATIENT);
    @Override
    public boolean savePatient(PatientDTO patientDTO) {
        System.out.println(patientDTO.toString());
        return patientDAO.save(new Patient(patientDTO.getId(),patientDTO.getName(),patientDTO.getDob(),patientDTO.getGender(),patientDTO.getContact(),patientDTO.getMedicalHistory()));
    }

    @Override
    public boolean deletePatient(String id) {
        return patientDAO.delete(id);
    }

    @Override
    public boolean updatePatient(PatientDTO patientDTO) {
        return patientDAO.update(new Patient(patientDTO.getId(),patientDTO.getName(),patientDTO.getDob(),patientDTO.getGender(),patientDTO.getContact(),patientDTO.getMedicalHistory()));
    }

    @Override
    public List<PatientDTO> getAllPatient() {
        List<Patient> all = patientDAO.getAll();
        List<PatientDTO> patientDTOList = new ArrayList<>();

        for (Patient patient : all) {
            patientDTOList.add(new PatientDTO(patient.getId(),patient.getName(),patient.getDob(),patient.getGender(),patient.getContact(),patient.getMedicalHistory()));
        }


        return patientDTOList;
    }

    @Override
    public String loadNextId() {
        return patientDAO.loadNextId();
    }
}
