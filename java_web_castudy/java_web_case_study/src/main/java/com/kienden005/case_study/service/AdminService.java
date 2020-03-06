package com.kienden005.case_study.service;

import com.kienden005.case_study.model.Admin;
import com.kienden005.case_study.model.Customer;

import java.util.List;

public interface AdminService extends  Service<Admin> {
    List<Admin> findAllByUserAndPassWord(String u, String p);
}
