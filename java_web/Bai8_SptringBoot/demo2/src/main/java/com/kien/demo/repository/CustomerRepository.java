package com.kien.demo.repository;

import com.kien.demo.model.Customer;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Long> {


    List<Customer> findByNameContaining(String name);
    @Query("select c from Customer c")
    List<Customer> findAll();
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
