package org.cityevents.domain.port.in.user;

import org.cityevents.aplication.dto.in.user.UserRegisterDTO;
import org.cityevents.aplication.dto.in.user.UserUpdateDTO;
import org.cityevents.domain.model.entity.docs.User;

public interface UserUseCause {
    User registerUser(UserRegisterDTO userRegisterDTO);
    User updateUser(UserUpdateDTO userRegisterDTO);
    User getUser(String id);
}
