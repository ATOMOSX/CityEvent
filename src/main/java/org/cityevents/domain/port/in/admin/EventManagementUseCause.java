package org.cityevents.domain.port.in.admin;

import org.cityevents.aplication.dto.in.admin.event.ModifyEventDTO;
import org.cityevents.aplication.dto.out.response.admin.EventResponseDTO;
import org.cityevents.domain.model.entity.docs.Event;
import org.cityevents.aplication.dto.in.admin.event.CreateEventDTO;

import java.util.List;

public interface EventManagementUseCause {
    Event createEvent(CreateEventDTO createEventDTO);

    void modifyEvent(ModifyEventDTO modifyEventDTO);

    EventResponseDTO getEvents();

    List<EventResponseDTO> getAllEvents();

    void deleteEvent(String eventId);

}
