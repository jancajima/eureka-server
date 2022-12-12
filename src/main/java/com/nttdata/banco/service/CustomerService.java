package com.nttdata.banco.service;

import com.nttdata.banco.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Customer service interface.
 */
public interface CustomerService {

    public Flux<Customer> findAll();

    public Mono<Customer> register(Customer customer);

    public Mono<Customer> update(Customer customer);

    public Mono<Void> delete(String id);

    public Mono<Customer> findById(String id);

}
