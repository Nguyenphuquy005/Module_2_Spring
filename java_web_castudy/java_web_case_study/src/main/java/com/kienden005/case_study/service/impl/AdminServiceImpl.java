package com.kienden005.case_study.service.impl;

import com.kienden005.case_study.model.Admin;
import com.kienden005.case_study.ropository.AdminRepository;
import com.kienden005.case_study.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository ;
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Page getAllCustomers(Pageable pageable) {
        return null;
    }

    @Override
    public Page findAllByFullNameContaining(String name, Pageable pageable) {
        return null;
    }

    @Override
    public void save(Admin o) {

    }

    @Override
    public void delete(Admin o) {

    }

    @Override
    public Admin findById(long id) {
        return null;
    }

    @Override
    public List<Admin> findAllByUserAndPassWord(String u, String p) {
        return adminRepository.findAllByUserAndPassWord(u,p);
    }

}
