package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    Customer getCustomerById(int id);
    void saveCustomer(Customer customer);
    void deleteCustomerById(int id);
    void update (int id, Customer customer);

}
