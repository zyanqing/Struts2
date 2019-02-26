package demo2;

import com.opensymphony.xwork2.ActionSupport;
import domain.User;

import java.util.Date;
/**
 * 数据封装方式一：提供属性的set方法的方式
 * @author jt
 *
 */
public class UserAction1 extends ActionSupport {

    //提供对应的属性
    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;

    //提供属性对应的set方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String execute() throws Exception {

        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        System.out.println(birthday);
        System.out.println(salary);

        //封装数据
        User user = new User();
        user.setAge(age);
        user.setPassword(password);
        user.setUsername(username);
        user.setSalary(salary);

        System.out.println(user);

        return NONE;
    }
}
