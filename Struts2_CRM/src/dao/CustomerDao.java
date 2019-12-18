package dao;

import domain.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> find();

    void save(Customer customer);

}
