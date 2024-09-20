package org.cityevents.infrastructure.repository;

import org.cityevents.domain.model.entity.docs.Pay;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRepository extends MongoRepository<Pay, String> {
}
