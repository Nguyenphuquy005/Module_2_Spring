package com.codegym.demo.repository;

import com.codegym.demo.model.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    Iterable<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void delete(Long id);
}
