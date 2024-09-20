package org.cityevents.infrastructure.repository;

import org.cityevents.domain.model.entity.docs.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    
}
