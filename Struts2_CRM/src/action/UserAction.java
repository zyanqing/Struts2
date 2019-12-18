package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    public String login() {

        UserService userService = new UserServiceImpl();

        User existUser = userService.login(this.user);

        if (existUser == null) {
            this.addActionError("用户名或密码错误！");
            return LOGIN;
        } else {
            return SUCCESS;
        }

    }


}











