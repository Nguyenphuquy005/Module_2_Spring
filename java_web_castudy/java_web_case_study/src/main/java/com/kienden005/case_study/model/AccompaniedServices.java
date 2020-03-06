package com.kienden005.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accompanied_services")
public class AccompaniedServices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_accompanied_services")
    private long idAccompaniedServices ;
    @Column(name = "name_accompanied_services")
    private  String nameAccompaniedServices ;
    @Column(name = "salary")
    private  long salary ;
    @Column(name = "units")
    private  long units ;
    @Column(name = "availability_status")
    private  String availabilityStatus ;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "contract_details" ,
            joinColumns = {@JoinColumn(name = "id_accompanied_services")},
            inverseJoinColumns = {@JoinColumn(name = "id_contract")}
    )
  private Set<Contract> contracts ;

    public AccompaniedServices() {
    }

    public long getIdAccompaniedServices() {
        return idAccompaniedServices;
    }

    public void setIdAccompaniedServices(long idAccompaniedServices) {
        this.idAccompaniedServices = idAccompaniedServices;
    }

    public String getNameAccompaniedServices() {
        return nameAccompaniedServices;
    }

    public void setNameAccompaniedServices(String nameAccompaniedServices) {
        this.nameAccompaniedServices = nameAccompaniedServices;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getUnits() {
        return units;
    }

    public void setUnits(long units) {
        this.units = units;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
