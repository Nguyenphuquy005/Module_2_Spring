package com.kienden005.case_study.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "positions")
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_positions")
    private long idPositions ;
    @Column(name = "name_position")
    private String namePosition ;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employeeList ;

    public Positions() {
    }

    public long getIdPositions() {
        return idPositions;
    }

    public void setIdPositions(long idPositions) {
        this.idPositions = idPositions;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
