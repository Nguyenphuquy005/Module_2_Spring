package com.kienden005.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_rent")
public class TypeRent {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_rent")
    private   long idTypeRent ;
    @Column(name = "name_type_rent")
    private  String nameTypeRent ;
    @OneToMany(targetEntity = Services.class)
    List<Services> services ;

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    public TypeRent() {
    }

    public long getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(long idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public String getNameTypeRent() {
        return nameTypeRent;
    }

    public void setNameTypeRent(String nameTypeRent) {
        this.nameTypeRent = nameTypeRent;
    }


}
