package com.codegym.demo.repository;

import com.codegym.demo.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {

    Iterable<Province> findAll();

    Province findOne(Long id);

    void save(Province province);

    void delete(Long id);
}
