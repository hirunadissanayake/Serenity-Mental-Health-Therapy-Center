package lk.ijse.gdse.main.dao.custom.impl;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.dao.custom.UserDAO;
import lk.ijse.gdse.main.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean isAvailable(String adminCode, String adminName) {
        Session session = FactoryConfiguration.getInstance().getSession();
        List list = session.createQuery("FROM User WHERE password = :adminCode AND username = :adminName").setParameter("adminCode", adminCode).setParameter("adminName", adminName).list();
        if(list.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public boolean save(User user) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(user);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<User> checkRole(String name, String password) {
        Session session = FactoryConfiguration.getInstance().getSession();
        System.out.println(name);
        System.out.println(password);
        return session.createQuery("FROM User WHERE password = :adminCode AND username = :adminName").setParameter("adminCode", password).setParameter("adminName", name).list();
    }
}
