package com.example.demo.repository;

import java.util.List;

public interface Repository<T> {
    List<T> finAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);
}
