package service;

import domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> find();

    void save(Customer customer);

}
