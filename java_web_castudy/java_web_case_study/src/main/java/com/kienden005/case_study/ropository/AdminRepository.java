package com.kienden005.case_study.ropository;

import com.kienden005.case_study.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    List<Admin> findAllByUserAndPassWord(String u, String p);
}
