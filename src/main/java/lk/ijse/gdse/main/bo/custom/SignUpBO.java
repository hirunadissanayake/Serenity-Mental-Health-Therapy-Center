package lk.ijse.gdse.main.bo.custom;

import lk.ijse.gdse.main.bo.SuperBO;
import lk.ijse.gdse.main.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public interface SignUpBO extends SuperBO {
     boolean saveUser(UserDTO userDTO);

     boolean checkCredentials(String name, String password);

     List<UserDTO> checkRole(String name, String password);
}
