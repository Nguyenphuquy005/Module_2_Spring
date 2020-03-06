package com.kienden005.case_study.service;

import com.kienden005.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Service<T> {
    List<T> findAll() ;
  Page<T> getAllCustomers(Pageable pageable);
 Page<T> findAllByFullNameContaining(String name ,Pageable pageable) ;
 void save(T t);
 void  delete(T t) ;
 T findById(long id) ;

}
