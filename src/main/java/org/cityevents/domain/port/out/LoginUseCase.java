package org.cityevents.domain.port.out;

import org.cityevents.aplication.dto.out.LoginRequestDTO;
import org.cityevents.domain.model.entity.docs.User;

public interface LoginUseCase {
    User login(LoginRequestDTO loginRequestDTO);
}
