package demo2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.User;

public class UserAction3 extends ActionSupport implements ModelDriven<User> {
    // 模型驱动使用的对象：前提必须手动提供对象的实例
    private User user = new User(); // 手动实例化User.

    // 模型驱动需要使用的方法:
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {

        System.out.println(user);
        return NONE;
    }
}


/*
        *模型驱动方式是最常用的方式，缺点：只能同时向一个对象中封装数据
        * 使用第二种可以向多个对象中同时封装数据

 */
