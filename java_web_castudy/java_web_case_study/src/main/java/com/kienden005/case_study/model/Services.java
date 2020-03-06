package com.kienden005.case_study.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_services")
    private long idServices ;

    @Column(name = "name_services")
    private String fullName ;

    @Column(name = "area")
    @NotNull(message = "Not Null , Number double")
    @Min(value = 1 ,message = "Min =1, Number double")
    private double area ;


    @Column(name = "num_floot")
    @NotNull(message = "Not Null , Number interger")
    @Min(value = 1 ,message = ", Number interger min =1")
    private int numFloot ;

    @Column(name = "max_number")
    @NotNull(message = "Not Null ")
    @Min(value = 1 ,message = ", Number interger min =1")
    private String max_number ;
    @Column(name = "rental_cost")
    private String Rental_cost ;
    @Column(name = "status_services")
    private String statusServices ;

    @OneToMany(targetEntity = Contract.class,mappedBy = "services",cascade = CascadeType.ALL)
    List<Contract> contracts ;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
   @ManyToOne
   @JoinColumn(name = "id_type_services")
   private TypeServices typeServices ;
    @ManyToOne
    @JoinColumn(name = "id_type_rent")
    private TypeRent typeRent ;

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public TypeServices getTypeServices() {
        return typeServices;
    }

    public void setTypeServices(TypeServices typeServices) {
        this.typeServices = typeServices;
    }

    public Services() {
    }

    public long getIdServices() {
        return idServices;
    }

    public void setIdServices(long idServices) {
        this.idServices = idServices;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumFloot() {
        return numFloot;
    }

    public void setNumFloot(int numFloot) {
        this.numFloot = numFloot;
    }

    public String getMax_number() {
        return max_number;
    }

    public void setMax_number(String max_number) {
        this.max_number = max_number;
    }

    public String getRental_cost() {
        return Rental_cost;
    }

    public void setRental_cost(String rental_cost) {
        Rental_cost = rental_cost;
    }



    public String getStatusServices() {
        return statusServices;
    }

    public void setStatusServices(String statusServices) {
        this.statusServices = statusServices;
    }



}
