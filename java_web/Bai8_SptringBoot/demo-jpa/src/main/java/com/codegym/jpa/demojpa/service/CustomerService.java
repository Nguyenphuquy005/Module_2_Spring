package com.codegym.jpa.demojpa.service;

import com.codegym.jpa.demojpa.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> getAllCustomers(Pageable pageable);
    Customer getCustomerById(long id);
    void saveCustomer(Customer customer);
    void deleteCustomerById(long id);
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
