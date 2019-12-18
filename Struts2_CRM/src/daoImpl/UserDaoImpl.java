package daoImpl;

import dao.UserDao;
import domain.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public User login(User user) {

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from User u where u.user_name=?0 and u.user_password=?1");
        query.setParameter(0,user.getUser_name());
        query.setParameter(1,user.getUser_password());
        List<User> list = query.list();

        if (list.size() > 0){
            return list.get(0);
        }
        transaction.commit();
        return null;
    }
}

















