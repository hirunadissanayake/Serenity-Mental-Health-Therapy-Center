package lk.ijse.gdse.main.dao.custom.impl;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.dao.custom.PatientDAO;
import lk.ijse.gdse.main.dto.PatientDTO;
import lk.ijse.gdse.main.entity.Patient;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    @Override
    public boolean save(Patient patient) {
        System.out.println("rrrrrrrrrrrrrrrrr"+patient.toString());
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
        System.out.println("update"+patient.toString());
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

    @Override
    public String loadNextId() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Query<String> query = session.createQuery("SELECT p.id FROM Patient p ORDER BY p.id DESC", String.class);
        query.setMaxResults(1);
        String lastId = query.uniqueResult();

        if (lastId != null && lastId.startsWith("P")) {
            String subString = lastId.substring(1);  // Remove "C"
            try {
                int idNum = Integer.parseInt(subString);
                return String.format("P%04d", idNum + 1);
            } catch (NumberFormatException e) {
                System.err.println("Error parsing customer ID: " + lastId);
            }
        }
        return "P0001"; // Default fallback
    }
}
