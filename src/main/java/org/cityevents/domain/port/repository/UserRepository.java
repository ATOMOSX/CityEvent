package org.cityevents.domain.port.repository;

import org.cityevents.domain.model.entity.docs.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
