package com.kienden005.case_study.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "custommer_style")
public class Customer_Style {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_custommer_style")
    private  long idCustommerStyle ;

    @Column(name = "name_custommer_style")
    private String nameCustommerStyle ;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customers ;

    public Customer_Style() {
    }

    public long getIdCustommerStyle() {
        return idCustommerStyle;
    }

    public void setIdCustommerStyle(long idCustommerStyle) {
        this.idCustommerStyle = idCustommerStyle;
    }

    public String getNameCustommerStyle() {
        return nameCustommerStyle;
    }

    public void setNameCustommerStyle(String nameCustommerStyle) {
        this.nameCustommerStyle = nameCustommerStyle;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
