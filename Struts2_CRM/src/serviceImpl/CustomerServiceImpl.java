package serviceImpl;

import dao.CustomerDao;
import daoImpl.CustomerDaoImpl;
import domain.Customer;
import service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerDao CustomerDao = new CustomerDaoImpl();

    @Override
    public List<Customer> find() {
        return CustomerDao.find();
    }

    @Override
    public void save(Customer customer) {
        CustomerDao.save(customer);
    }
}
