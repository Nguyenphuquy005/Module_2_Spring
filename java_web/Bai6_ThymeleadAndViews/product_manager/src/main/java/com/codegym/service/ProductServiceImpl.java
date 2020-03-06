package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    public static Map<Integer , Product> products ;
    static {
        products = new HashMap<>() ;
        products.put(1,new Product(1,"XeMay","20-1-2019","Da nang"));
        products.put(2,new Product(2,"XeDap","20-1-2019","Da nang"));
        products.put(3,new Product(3,"OTo","20-1-2019","Da nang"));
        products.put(4,new Product(4,"XeCau","20-1-2019","Da nang"));
        products.put(5,new Product(5,"XeDua","20-1-2019","Da nang"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
           products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void remote(int id) {
      products.remove(id) ;
    }
}
