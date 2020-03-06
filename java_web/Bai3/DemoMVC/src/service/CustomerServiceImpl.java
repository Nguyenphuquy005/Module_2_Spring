package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> listCustomers;
    static {
        listCustomers = new HashMap<>();
        listCustomers.put(1, new Customer(1, "Kien Den", "kienden@gmail.com","Nam O"));
        listCustomers.put(2, new Customer(2, "Kien Den2", "kienden2@gmail.com","Nam O 2"));
        listCustomers.put(3, new Customer(3, "Kien Den3", "kienden3@gmail.com","Nam O 3"));
        listCustomers.put(4, new Customer(4, "Kien Den4", "kienden4@gmail.com","Nam O 4"));
    }
    @Override
    public List<Customer> getAllCustomer() {
        return new ArrayList<>(listCustomers.values());
    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomerById(int id) {

    }

    @Override
    public void update(int id, Customer customer) {

    }
}
