package services;

import model.Product;

import java.util.List;

public interface ProductServices {
 List<Product> findAll();
 void save(Product product);
 void update(int id, Product product) ;
 void  remote(int id) ;
 Product findById(int id);
 Product findByName(String name);

}
