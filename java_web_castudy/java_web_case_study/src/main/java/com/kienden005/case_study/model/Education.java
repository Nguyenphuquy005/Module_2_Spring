package com.kienden005.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_education")
    private  long idEducation ;
    @Column(name = "education")
    private  String education ;
    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employeeList ;

    public Education() {
    }

    public long getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(long idEducation) {
        this.idEducation = idEducation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
