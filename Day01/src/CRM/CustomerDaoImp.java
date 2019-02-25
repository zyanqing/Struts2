package CRM;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

public class CustomerDaoImp implements CustomerDao {
    @Override
    public List<Customer> find() {

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Customer");
        List<Customer> list = query.list();

        transaction.commit();
        return list;
    }

    @Test
    public void demo(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("zhansan");

        session.save(customer);

        transaction.commit();
    }
}
