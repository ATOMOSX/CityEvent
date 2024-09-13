package org.cityevents.domain.port;

import org.cityevents.domain.model.docs.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
