package com.codegym.demospringboots.service;

import com.codegym.demospringboots.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl implements PersonService {
    public static Map<Integer, Person> map;

    static {
        map = new HashMap<>();
        map.put(1, new Person(1, "Huy", "Da Nang"));
        map.put(2, new Person(2, "Lệ Rơi Huy", "Quảng Nam"));
        map.put(3, new Person(3, "Lệ Ngọc Huy", "Huế"));

    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void save(Person person) {
        map.put(person.getId(), person);
    }

    @Override
    public Person findGetId(int id) {
        return map.get(id);
    }

    @Override
    public void update(int id, Person person) {
        map.put(person.getId(), person);
    }

    @Override
    public void delete(int id) {
        map.remove(id);
    }
}
