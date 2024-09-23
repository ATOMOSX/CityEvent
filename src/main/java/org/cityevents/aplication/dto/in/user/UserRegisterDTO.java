package org.cityevents.aplication.dto.in.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegisterDTO (
    @NotBlank(message = "Cedula is required")
    String cedula ,

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    String name,

    @NotBlank(message = "Address is required")
    String address,

    @NotBlank(message = "Phone is required")
    @Size(min = 10, max = 15, message = "Phone must be between 10 and 15 characters")
    String phone,

    @Email(message = "Email should be valid")
    String email,

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    String password
) {
}
