package com.kienden005.case_study.service.impl;

import com.kienden005.case_study.model.ContractDetails;
import com.kienden005.case_study.ropository.ContractDetailsRepository;
import com.kienden005.case_study.service.ContractDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractDetailsServiceImpl implements ContractDetailsService {

    @Autowired
    ContractDetailsRepository contractDetailsRepository ;
    @Override
    public List<ContractDetails> findAll() {
        return null;
    }

    @Override
    public Page<ContractDetails> getAllCustomers(Pageable pageable) {
        return null;
    }

    @Override
    public Page<ContractDetails> findAllByFullNameContaining(String name, Pageable pageable) {
        return null;
    }

    @Override
    public void save(ContractDetails contractDetails) {
 contractDetailsRepository.save(contractDetails) ;
    }

    @Override
    public void delete(ContractDetails contractDetails) {

    }

    @Override
    public ContractDetails findById(long id) {
        return  contractDetailsRepository.findById(id).orElse(null) ;
    }
}
