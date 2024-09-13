package org.cityevents.domain.port;

import org.cityevents.domain.model.docs.Pay;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayRepository extends MongoRepository<Pay, String> {
}
