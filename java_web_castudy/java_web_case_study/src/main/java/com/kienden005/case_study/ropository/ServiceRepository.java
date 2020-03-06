package com.kienden005.case_study.ropository;

import com.kienden005.case_study.model.Customer;
import com.kienden005.case_study.model.Services;
import com.kienden005.case_study.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Services ,Long> {
    Page<Services> findAllByFullNameContaining(String name, Pageable pageable);
}
