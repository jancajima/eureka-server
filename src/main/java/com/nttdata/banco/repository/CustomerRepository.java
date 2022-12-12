package com.nttdata.banco.repository;

import com.nttdata.banco.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Customer Repository.
 */
@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
