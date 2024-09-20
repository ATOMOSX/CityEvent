package org.cityevents.infrastructure.repository;

import org.cityevents.domain.model.entity.docs.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
