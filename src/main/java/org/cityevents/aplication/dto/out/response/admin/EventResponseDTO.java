package org.cityevents.aplication.dto.out.response.admin;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.cityevents.domain.model.entity.subdocs.Locality;

import java.util.List;

public record EventResponseDTO(
        @NotBlank(message = "Id is required")
        String id,

        @NotBlank(message = "Image URL is required")
        String image,

        @NotBlank(message = "Status is required")
        String status,

        @NotBlank(message = "Name is required")
        @Size(max = 100, message = "Name must be less than 100 characters")
        String name,

        @NotBlank(message = "Description is required")
        @Size(max = 500, message = "Description must be less than 500 characters")
        String description,

        @NotBlank(message = "Location is required")
        @Size(max = 200, message = "Address must be less than 200 characters")
        String address,

        @NotBlank(message = "Image URL is required")
        String imageLocations,

        @NotBlank(message = "Type of event is required")
        String typeEvent,

        @NotBlank(message = "Date is required")
        String date,

        @NotBlank(message = "Localities is required")
        List<Locality> localities
) {
}
