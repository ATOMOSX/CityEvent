package org.cityevents.domain.port;

import org.cityevents.domain.model.docs.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
