package com.kienden005.case_study.service.impl;

import com.kienden005.case_study.model.Services;
import com.kienden005.case_study.ropository.ServiceRepository;
import com.kienden005.case_study.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Page<Services> getAllCustomers(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Services> findAllByFullNameContaining(String name, Pageable pageable) {
        return serviceRepository.findAllByFullNameContaining(name, pageable);
    }

    @Override
    public void save(Services services) {
        serviceRepository.save(services);
    }

    @Override
    public void delete(Services services) {
        serviceRepository.delete(services);
    }

    @Override
    public Services findById(long id) {
        return serviceRepository.findById(id).orElse(null);
    }


}
