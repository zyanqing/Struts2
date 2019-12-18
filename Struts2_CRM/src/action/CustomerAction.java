package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Customer;
import service.CustomerService;
import serviceImpl.CustomerServiceImpl;

import java.util.List;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    CustomerService CustomerService = new CustomerServiceImpl();

    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }


    public String find(){

        List<Customer> list = CustomerService.find();



        return "find";
    }


}
















