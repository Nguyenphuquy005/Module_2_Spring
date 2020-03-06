package com.kienden005.case_study.service;

import com.kienden005.case_study.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllByUserNameAndPassWord(String u , String p) ;
    void  save(User user) ;
}
