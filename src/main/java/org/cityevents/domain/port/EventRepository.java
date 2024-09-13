package org.cityevents.domain.port;

import org.cityevents.domain.model.docs.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
