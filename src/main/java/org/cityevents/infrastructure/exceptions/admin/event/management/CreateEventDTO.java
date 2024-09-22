package org.cityevents.infrastructure.exceptions.admin.event.management;

public record CreateEventDTO(
        String name,
        String description,
        String date,
        String location,
        String category
) {
}
