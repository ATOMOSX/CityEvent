package org.cityevents.domain.port;

import org.cityevents.domain.model.docs.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {

}
