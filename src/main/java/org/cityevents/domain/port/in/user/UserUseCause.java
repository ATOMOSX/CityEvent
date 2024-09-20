package org.cityevents.domain.port.in.user;

import org.cityevents.aplication.dto.in.UserRegisterDTO;
import org.cityevents.domain.model.entity.docs.User;

public interface UserUseCause {
    User registerUser(UserRegisterDTO userRegisterDTO);
}
