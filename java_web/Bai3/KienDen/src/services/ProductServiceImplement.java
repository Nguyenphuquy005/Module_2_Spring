package services;

import model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImplement implements  ProductServices {
   private static Map<Integer , Product> products ;
   static {
       products = new HashMap<>();
       products.put(1, new Product(1, "iphone", 12000, "iphoneX", "apple"));
       products.put(2, new Product(2, "note9", 10000, "note", "samsung"));
   }



    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remote(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
