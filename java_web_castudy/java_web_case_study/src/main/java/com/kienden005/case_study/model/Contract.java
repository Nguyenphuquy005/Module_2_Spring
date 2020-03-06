package com.kienden005.case_study.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract")
    private long idContract;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy" )
    @Column(name = "daystart_contract")
    private Date daystartContract ;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dayend_contract")
    private Date dayendContract ;

    @Column(name = "deposits")
    private int deposits ;

    @Column(name = "total_money")
    private  int totalMoney ;

    @ManyToOne
    @JoinColumn(name = "id_custommer")
    private  Customer customer ;

    @ManyToOne
    @JoinColumn(name = "id_services")
    private  Services services ;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private  Employee employee ;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "contract_details" ,
            joinColumns = {@JoinColumn(name = "id_contract")},
            inverseJoinColumns = {@JoinColumn(name = "id_accompanied_services")}
    )
    private Set<AccompaniedServices> accompaniedServicesSet ;

    public Contract() {
    }

    public long getIdContract() {
        return idContract;
    }

    public void setIdContract(long idContract) {
        this.idContract = idContract;
    }

    public Date getDaystartContract() {
        return daystartContract;
    }

    public void setDaystartContract(Date daystartContract) {
        this.daystartContract = daystartContract;
    }

    public Date getDayendContract() {
        return dayendContract;
    }

    public void setDayendContract(Date dayendContract) {
        this.dayendContract = dayendContract;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<AccompaniedServices> getAccompaniedServicesSet() {
        return accompaniedServicesSet;
    }

    public void setAccompaniedServicesSet(Set<AccompaniedServices> accompaniedServicesSet) {
        this.accompaniedServicesSet = accompaniedServicesSet;
    }

}
