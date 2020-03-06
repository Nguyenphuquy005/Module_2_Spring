package com.son.demo.service;

import com.son.demo.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    List<Customer> search(String q);

    Customer findById(long id);

    void save(Customer customer);

    void delete(Customer customer);
}
