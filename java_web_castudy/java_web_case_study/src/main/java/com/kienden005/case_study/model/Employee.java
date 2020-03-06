package com.kienden005.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private  long idEmployee ;
    @Column(name = "full_name")
    private  String fullname ;

    @Column(name = "brithday")
    private String brithday ;
    @Column(name = "id_card")
    private String idCard ;
    @Column(name = "salary")
    private  String salary ;
    @Column(name = "phone_number")
    private  String phoneNumber;
    @Column(name = "email")
    private String email ;
    @Column(name = "adress")
    private  String adress ;

    @OneToMany(targetEntity = Contract.class)
    List<Contract> contracts ;

    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department ;
    @ManyToOne
    @JoinColumn(name = "id_education")
    private Education education ;
    @ManyToOne
    @JoinColumn(name = "id_positions")
    private Positions positions;

    public Employee() {
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }



    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Positions getPositions() {
        return positions;
    }

    public void setPositions(Positions positions) {
        this.positions = positions;
    }
}
