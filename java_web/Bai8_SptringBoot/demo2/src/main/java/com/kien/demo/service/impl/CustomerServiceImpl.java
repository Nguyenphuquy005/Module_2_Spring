package com.kien.demo.service.impl;

import com.kien.demo.model.Customer;
import com.kien.demo.repository.CustomerRepository;
import com.kien.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired private  CustomerRepository customerRepository ;
    @Override
    public List<Customer> findAll() {

      return customerRepository.findAll();
    }

    @Override
    public List<Customer> search(String name) {

      return customerRepository.findByNameContaining(name) ;
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Customer customer) {
     customerRepository.save(customer) ;
    }

    @Override
    public void delete(Customer customer) {
    customerRepository.delete(customer);
    }


  @Override
  public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
    return customerRepository.findAllByNameContaining(name,pageable);
  }
  @Override
  public Page<Customer> getAllCustomers(Pageable pageable) {
    return customerRepository.findAll(pageable);
  }
}
