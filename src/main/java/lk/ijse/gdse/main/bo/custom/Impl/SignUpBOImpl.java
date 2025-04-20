package lk.ijse.gdse.main.bo.custom.Impl;

import lk.ijse.gdse.main.bo.custom.SignUpBO;
import lk.ijse.gdse.main.dao.DAOFactory;
import lk.ijse.gdse.main.dao.custom.UserDAO;
import lk.ijse.gdse.main.dto.UserDTO;
import lk.ijse.gdse.main.entity.User;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SignUpBOImpl implements SignUpBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.type.SIGNUP);
    @Override
    public boolean saveUser(UserDTO userDTO) {
        boolean isAvailable = userDAO.isAvailable(userDTO.getAdminCode(),userDTO.getAdminName());

        if(isAvailable){
            return userDAO.save(new User(userDTO.getUsername(),userDTO.getEmail(),userDTO.getPassword(),userDTO.getRole()));
        }
        return false;
    }

    @Override
    public boolean checkCredentials(String name, String password) {
        return userDAO.isAvailable(password,name);
    }

    @Override
    public List<UserDTO> checkRole(String name, String password) {

        List<User> users = userDAO.checkRole(name, password);
        List<UserDTO> userDTOS = new ArrayList<>();
        for(User user : users){
            System.out.println(user);
            userDTOS.add(new UserDTO(user.getUsername(),user.getPassword(),user.getEmail(),user.getRole()));
        }
        return userDTOS;

    }
}
