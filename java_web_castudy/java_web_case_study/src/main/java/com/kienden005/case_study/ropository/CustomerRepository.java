package com.kienden005.case_study.ropository;

import com.kienden005.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer ,Long> {
   Page<Customer> findAllByFullNameContaining(String name,Pageable pageable);

//   @Query(value = "select  c from  Customer c inner join Contract ct " +
//           "on c.idCustommer = ct.customer.idCustommer")
//  Iterable<Customer> findAllCustomerUsedContract(long id) ;

    @Query(value = "select  c ,ct as count from  Customer c inner join Contract ct " +
            "on c.idCustommer = ct.customer.idCustommer where ct.dayendContract >= current_date" +
            " group by c.idCustommer")
   List<Customer> findAllCustomerContract();



    @Query(value = "select   c   from  Customer c left join Contract ct " +
            "on c.idCustommer = ct.customer.idCustommer left join ContractDetails ctd on ctd.id_contract = ct.idContract " +
            " group by c.idCustommer")
    List<Customer> findJoin();




}
