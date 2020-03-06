package com.kienden005.case_study.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contract_details")
public class ContractDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract_details")
    private long idContractDetails ;
    private  long id_contract;
    private  long id_accompanied_services ;
    @Column(name = "amount")
    @Min(10)
    private int amount ;

    public ContractDetails() {
    }

    public long getIdContractDetails() {
        return idContractDetails;
    }

    public void setIdContractDetails(long idContractDetails) {
        this.idContractDetails = idContractDetails;
    }

    public long getId_contract() {
        return id_contract;
    }

    public void setId_contract(long id_contract) {
        this.id_contract = id_contract;
    }

    public long getId_accompanied_services() {
        return id_accompanied_services;
    }

    public void setId_accompanied_services(long id_accompanied_services) {
        this.id_accompanied_services = id_accompanied_services;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
