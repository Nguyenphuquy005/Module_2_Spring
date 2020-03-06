package com.kienden005.case_study.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "custommer")
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_custommer")
    private long idCustommer ;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "brithday")
    @NotEmpty
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$" ,message = "birthday dd/mm/yy")
    private String brithday ;

    @Column(name = "id_card")
    @NotEmpty
    @Pattern(regexp = "^[0-9]{9}$",message = " id cart 9 number")
    private  String idCard ;

    @Column(name = "phone_number")
    @NotEmpty
    @Pattern(regexp = "^((090)|(091))[0-9]{7}$" ,message = "The Fisrt 090 or 091")
     private  String phoneNumber ;

    @Column(name = "email")
    @NotEmpty
    @Pattern(regexp = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")
     private  String email ;

    @Column(name = "adress")
     private  String adress ;

    @OneToMany(targetEntity = Contract.class, mappedBy = "customer",cascade = CascadeType.ALL)
    List<Contract> contracts ;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    @ManyToOne
    @JoinColumn(name = "id_custommer_style")
    private Customer_Style customerStyle ;

    public long getIdCustommer() {
        return idCustommer;
    }

    public Customer() {
    }

    public long getIdCustommer(long l) {
        return idCustommer;
    }

    public void setIdCustommer(long idCustommer) {
        this.idCustommer = idCustommer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public Customer_Style getCustomerStyle() {
        return customerStyle;
    }

    public void setCustomerStyle(Customer_Style customerStyle) {
        this.customerStyle = customerStyle;
    }


}
