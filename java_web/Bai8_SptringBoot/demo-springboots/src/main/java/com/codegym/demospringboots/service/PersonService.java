package com.codegym.demospringboots.service;

import com.codegym.demospringboots.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    void save(Person person);

    Person findGetId(int id);

    void update(int id, Person person);

    void delete(int id);
}
