package org.cityevents.domain.port.in.user;

import org.cityevents.aplication.dto.in.user.UserRegisterDTO;
import org.cityevents.aplication.dto.in.user.UserUpdateDTO;
import org.cityevents.domain.model.entity.docs.User;
import org.cityevents.infrastructure.exceptions.in.UserAlreadyExistException;
import org.cityevents.infrastructure.exceptions.in.UserNotFoundException;

import java.util.List;

public interface UserManagementUseCause {
    User registerUser(UserRegisterDTO userRegisterDTO) throws UserAlreadyExistException;
    User updateUser(UserUpdateDTO userRegisterDTO) throws UserNotFoundException;
    User getUser(String id) throws UserNotFoundException;
    List<User>getAllUsers();
    void deleteUser(String id) throws UserNotFoundException;
}
