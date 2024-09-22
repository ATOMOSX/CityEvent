package org.cityevents.aplication.dto.in.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserUpdateDTO(
        @NotBlank(message = "Cedula is required") String cedula ,
        @NotBlank(message = "Name is required") @Size(min = 2, max = 50) String name,
        @NotBlank(message = "Address is required") String address,
        @NotBlank(message = "Phone is required") @Size(min = 10, max = 15) String phone,
        @Email(message = "Email should be valid") String email,
        @NotBlank(message = "Password is required") @Size(min = 8) String password
) {
}
