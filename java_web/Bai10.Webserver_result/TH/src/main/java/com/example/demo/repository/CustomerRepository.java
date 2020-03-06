package com.example.demo.repository;

import com.example.demo.entity.Customer;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


public interface CustomerRepository extends Repository<Customer> {
}
