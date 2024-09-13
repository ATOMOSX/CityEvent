package org.cityevents.domain.port;

import org.cityevents.domain.model.docs.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CouponRepository extends MongoRepository<Coupon, String> {
}
