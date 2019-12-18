package daoImpl;

import dao.CustomerDao;
import domain.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<Customer> find() {

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Customer");
        List<Customer> list = query.list();

        transaction.commit();
        return list;
    }

    @Override
    public void save(Customer customer) {

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);

        transaction.commit();

    }
}
