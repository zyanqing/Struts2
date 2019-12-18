import domain.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import service.UserService;
import serviceImpl.UserServiceImpl;
import utils.HibernateUtils;

public class Demo {

    private UserService UserService = new UserServiceImpl();

    @Test

    public void demo1() {

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUser_name("aaa");
        user.setUser_password("123");

        session.save(user);

        transaction.commit();

    }

    @Test
    public void demo2() {


        User user = new User();
        user.setUser_name("aaa");
        user.setUser_password("123");

         System.out.println(UserService.login(user));

    }

}
















