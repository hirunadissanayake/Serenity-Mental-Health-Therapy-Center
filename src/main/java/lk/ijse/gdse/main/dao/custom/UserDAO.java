package lk.ijse.gdse.main.dao.custom;

import lk.ijse.gdse.main.dao.SuperDAO;
import lk.ijse.gdse.main.entity.User;

import java.util.List;

public interface UserDAO extends SuperDAO {
    boolean isAvailable(String adminCode, String adminName);

    boolean save(User user);

    List<User> checkRole(String name, String password);
}
