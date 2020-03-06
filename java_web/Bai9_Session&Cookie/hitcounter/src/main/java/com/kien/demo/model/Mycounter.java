package com.kien.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mycounter {
    @Id
    private  int count ;

    public Mycounter(int count) {
        this.count = count;
    }

    public Mycounter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int increment()
    {
        return  count++ ;
    }
}
