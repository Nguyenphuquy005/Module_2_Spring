package com.kienden005.case_study.service.impl;

import com.kienden005.case_study.model.Customer;
import com.kienden005.case_study.ropository.CustomerRepository;
import com.kienden005.case_study.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository ;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> getAllCustomers(Pageable pageable) {
        return customerRepository.findAll(pageable) ;
    }

    @Override
    public Page<Customer> findAllByFullNameContaining(String name, Pageable pageable) {
        return customerRepository.findAllByFullNameContaining(name, pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }



    @Override
    @Query
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id).orElse(null);
    }





    @Override
    public List<Customer> findAllCustomerContract() {
        return customerRepository.findAllCustomerContract();
    }

    @Override
    public List<Customer> findJoin() {
        return customerRepository.findJoin();
    }


}
