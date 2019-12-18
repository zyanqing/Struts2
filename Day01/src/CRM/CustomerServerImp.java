package CRM;

import java.util.List;

public class CustomerServerImp implements CustomerServer {

    @Override
    public List<Customer> find() {
        CustomerDao CustomerDao = new CustomerDaoImp();
        return CustomerDao.find();
    }
}















