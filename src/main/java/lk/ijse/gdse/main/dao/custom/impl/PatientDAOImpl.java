package lk.ijse.gdse.main.dao.custom.impl;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.dao.custom.PatientDAO;
import lk.ijse.gdse.main.dto.PatientDTO;
import lk.ijse.gdse.main.entity.Patient;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    @Override
    public boolean save(Patient patient) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(patient);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Patient patient = session.get(Patient.class, id);

        session.remove(patient);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Patient patient) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Patient patient1 = session.get(Patient.class, patient.getId());
        patient1.setName(patient.getName());
        patient1.setDob(patient.getDob());
        patient1.setGender(patient.getGender());
        patient1.setContact(patient.getContact());
        patient1.setMedicalHistory(patient.getMedicalHistory());
        session.merge(patient1);

        transaction.commit();
        session.close();

        return true;
    }

    @Override
    public List<Patient> getAll() {
        Session session = FactoryConfiguration.getInstance().getSession();
        return session.createQuery("from Patient ").list();
    }
}
