package org.cityevents.aplication.dto.out;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequestDTO(
        @Email(message = "Email should be valid") String email,
        @NotBlank(message = "Password is required") String password
    ) {
}
