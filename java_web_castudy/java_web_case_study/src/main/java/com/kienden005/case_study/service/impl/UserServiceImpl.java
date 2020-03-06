package com.kienden005.case_study.service.impl;

import com.kienden005.case_study.model.User;
import com.kienden005.case_study.ropository.UserRepository;
import com.kienden005.case_study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    UserRepository userRepository ;

    @Override
    public List<User> findAllByUserNameAndPassWord(String u, String p) {
        return userRepository.findAllByUserNameAndPassWord(u,p);
    }

    @Override
    public void save(User user) {
        userRepository.save(user) ;
    }
}
