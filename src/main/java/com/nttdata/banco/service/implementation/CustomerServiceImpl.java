package com.nttdata.banco.service.implementation;

import com.nttdata.banco.model.Customer;
import com.nttdata.banco.repository.CustomerRepository;
import com.nttdata.banco.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Customer service implementation.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> register(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Mono<Customer> update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Mono<Void> delete(String id) {
        return customerRepository.deleteById(id);
    }

    @Override
    public Mono<Customer> findById(String id) {
        return customerRepository.findById(id);
    }
}
