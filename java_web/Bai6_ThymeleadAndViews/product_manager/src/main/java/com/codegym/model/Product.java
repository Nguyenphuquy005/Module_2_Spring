package com.codegym.model;

public class Product {
    private int id ;
    private String name ;
    private String daystart ;
    private String address ;

    public Product(int id, String name, String daystart, String address) {
        this.id = id;
        this.name = name;
        this.daystart = daystart;
        this.address = address;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaystart() {
        return daystart;
    }

    public void setDaystart(String daystart) {
        this.daystart = daystart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
