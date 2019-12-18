package serviceImpl;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao UserDao = new UserDaoImpl();

    @Override
    public User login(User user) {

        return  UserDao.login(user);
    }
}
