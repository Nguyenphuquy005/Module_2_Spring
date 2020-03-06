package com.kienden005.case_study.ropository;

import com.kienden005.case_study.model.Contract;
import com.kienden005.case_study.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ContractRopository  extends JpaRepository<Contract ,Long> {

}
