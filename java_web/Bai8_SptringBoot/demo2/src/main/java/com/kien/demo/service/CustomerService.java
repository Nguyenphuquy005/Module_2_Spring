package com.kien.demo.service;

import com.kien.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
   List<Customer> search(String name) ;
   Customer findById(long id) ;
   void  save(Customer customer) ;
   void delete(Customer customer) ;
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
    Page<Customer> getAllCustomers(Pageable pageable);
}
