package org.cityevents.aplication.dto.in.admin.event;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ModifyEventDTO(
        @NotBlank(message = "Name is required")
        @Size(max = 100, message = "Name must be less than 100 characters")

        String name,
        @NotBlank(message = "Description is required")
        @Size(max = 500, message = "Description must be less than 500 characters")
        String description,

        @NotBlank(message = "Date is required")
        String date,

        @NotBlank(message = "Location is required")
        @Size(max = 100, message = "Location must be less than 200 characters")
        String location,

        @NotBlank(message = "Category is required")
        @Size(max = 100, message = "Category must be less than 20 characters")
        String category
) {
}
