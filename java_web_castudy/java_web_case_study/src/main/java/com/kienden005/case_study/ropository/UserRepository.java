package com.kienden005.case_study.ropository;

import com.kienden005.case_study.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByUserNameAndPassWord(String u, String p);
}
