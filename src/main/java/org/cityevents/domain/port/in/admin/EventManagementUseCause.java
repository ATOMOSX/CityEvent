package org.cityevents.domain.port.in.admin;

import org.cityevents.domain.model.entity.docs.Event;
import org.cityevents.infrastructure.exceptions.admin.event.management.CreateEventDTO;

public interface EventManagementUseCause {
    Event createEvent(CreateEventDTO createEventDTO);
}
