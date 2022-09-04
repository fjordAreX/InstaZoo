package ru.project.instazoo.facafe;

import org.springframework.stereotype.Component;
import ru.project.instazoo.dto.UserDTO;
import ru.project.instazoo.entity.Users;

@Component
public class UserFacade {

    public UserDTO userToUserDTO(Users user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getName());
        userDTO.setLastname(user.getLastname());
        userDTO.setUsername(user.getUsername());
        userDTO.setBio(user.getBio());
        return userDTO;
    }

}
