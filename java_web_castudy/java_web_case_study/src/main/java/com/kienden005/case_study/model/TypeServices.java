package com.kienden005.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_services")
public class TypeServices {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_services")
    private  long idTypeServices ;
    @Column(name = "name_type_services")
    private String nameTypeServices ;
    @OneToMany(targetEntity = Services.class)
     private List<Services> services ;

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    public TypeServices() {
    }

    public long getIdTypeServices() {
        return idTypeServices;
    }

    public void setIdTypeServices(long idTypeServices) {
        this.idTypeServices = idTypeServices;
    }

    public String getNameTypeServices() {
        return nameTypeServices;
    }

    public void setNameTypeServices(String nameTypeServices) {
        this.nameTypeServices = nameTypeServices;
    }


}
