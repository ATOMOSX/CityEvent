package org.cityevents.infrastructure.repository;

import org.cityevents.domain.model.entity.docs.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends MongoRepository<Coupon, String> {
}
