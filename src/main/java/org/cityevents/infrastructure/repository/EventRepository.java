package org.cityevents.infrastructure.repository;

import org.cityevents.domain.model.entity.docs.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
}
