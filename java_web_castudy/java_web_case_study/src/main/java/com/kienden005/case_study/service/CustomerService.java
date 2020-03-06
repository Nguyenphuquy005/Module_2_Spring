package com.kienden005.case_study.service;

import com.kienden005.case_study.model.Customer;

import java.util.List;

public interface CustomerService extends  Service<Customer> {
    List<Customer> findAllCustomerContract();
    List<Customer> findJoin() ;
}
