package com.kienden005.case_study.service.impl;

import com.kienden005.case_study.model.Contract;
import com.kienden005.case_study.model.Customer;
import com.kienden005.case_study.ropository.ContractRopository;
import com.kienden005.case_study.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRopository contractRopository;

    @Override
    public List<Contract> findAll() {
        return contractRopository.findAll();
    }

    @Override
    public Page<Contract> getAllCustomers(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Contract> findAllByFullNameContaining(String name, Pageable pageable) {
        return null;
    }

    @Override
    public void save(Contract contract) {
        contractRopository.save(contract);
    }

    @Override
    public void delete(Contract contract) {

    }

    @Override
    public Contract findById(long id) {
        return contractRopository.findById(id).orElse(null);
    }



}
